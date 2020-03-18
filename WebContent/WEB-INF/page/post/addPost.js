var $;
var $form;
var form;
layui.config({
	base : "js/"
}).use(['form','layer','jquery','laydate'],function(){
	var layer = parent.layer === undefined ? layui.layer : parent.layer,
		laypage = layui.laypage,laydate = layui.laydate;
		$ = layui.jquery;
		form = layui.form;
		laydate.render({
			elem: '#birthday' //指定元素
			,max: 'new Date()'
		});

// form.on('select(deptFilte)',function(data){
	$(function (data) {
		var seone =  data.value;
		$.ajax({
			type: "post",
			url: ctx+"/post/deptList",
			dataType:"json",
			data:{
				csq:seone
			},
			success:function(data){
				$('#zpbm').empty();
				$('#zpbm').append(new Option("请选择部门",""));
				$.each(data.data,function(index,item){
					$('#zpbm').append(new Option(item.deptname,item.deptid));//往下拉菜单里添加元素
				})
				form.render("select");//菜单渲染 把内容加载进去
			}
		});
	});
		
		// $("#zpbm").blur(function(){
		// 	$.ajax({
	    //         type: "get",
	    //         url: ctx+"/user/checkUserByNickname/"+"123",
	    //         success:function(data){
	    //         	if(data.code!=0){
	    //         		top.layer.msg(data.msg);
	    //         		$("#nickname").val("");
	    //         		$("#nickname").focus();
	    //         	}
	    //         }
	    //     });
		// });
		
//		$("#eMail").blur(function(){
//			$.ajax({
//				type: "post",
//				url: ctx+"/user/checkUserByEmail?eMail="+$("#eMail").val(),
//				success:function(data){
//					if(data.code!=0){
//						top.layer.msg(data.msg);
//						$("#eMail").val("");
//						$("#eMail").focus();
//					}
//				}
//			});
//		});

 	form.on("submit(addPost)",function(data){

 		//弹出loading
 		var index = top.layer.msg('appPost1_数据提交中，请稍候',{icon: 16,time:false,shade:0.8});
 		var msg,flag=false;
		$.ajax({
			type: "post",
			url: ctx+"/post/insPost",
			async:false,
			data:data.field,
			dataType:"json",
			success:function(d){
				if(d.code==0){
					msg="职位添加成功！";
					flag=true;
					//$("#auf")[0].reset();
				}else{
					msg=d.msg;
				}
			}
		});
		setTimeout(function(){
			top.layer.close(index);
			if(flag){
				top.layer.msg(msg,{icon: 1});
			}else{
				top.layer.msg(msg,{icon: 5});
			}
			//layer.closeAll("iframe");
			//刷新父页面
			//parent.location.reload();
		},2000);
		return false;
 	})
})
