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
				// alert("用人部门编号："+$('#zdept').val()+"==名称："+zdept);
				 // $('#zdept').append(new Option(zdept,$('#zdept').val()));
				$.each(data.data,function(index,item){
					$('#zdept').append(new Option(item.deptname,item.deptid));//往下拉菜单里添加元素
				})
				form.render("select");//菜单渲染 把内容加载进去
			}
		});
	});

 	form.on("submit(editPost)",function(data){
 		//弹出loading
 		var index = top.layer.msg('数据提交中，请稍候',{icon: 16,time:false,shade:0.8});
 		var msg,flag=false;
		$.ajax({
			type: "post",
			url: ctx+"/post/updPost",
			async:false,
			data:data.field,
			dataType:"json",
			success:function(d){
				if(d.code==0){
					msg="职位修改成功！";
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
			// layer.closeAll("iframe");
			// 刷新父页面
			parent.location.reload();
		},2000);
		return false;
 	})

	form.on("submit(subPost)",function(data){
		data.field.zstatus='发布' ;
		//弹出loading
		var index = top.layer.msg('数据提交中，请稍候',{icon: 16,time:false,shade:0.8});
		var msg,flag=false;
		$.ajax({
			type: "post",
			url: ctx+"/post/updPost",
			async:false,
			data:data.field,
			dataType:"json",
			success:function(d){
				if(d.code==0){
					parent.layui.table.reload('educationReload',{page:{curr:1}});
					msg="职位发布成功！";
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
			// layer.closeAll("iframe");
			// 刷新父页面
			parent.location.reload();
		},2000);
		return false;
	})
})
