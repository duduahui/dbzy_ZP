var $;
var form;
layui.config({
	base : "js/"
}).use(['form','layer','jquery','laydate'],function(){
	var layer = parent.layer === undefined ? layui.layer : parent.layer,
		laydate = layui.laydate;
		$ = layui.jquery;
		form = layui.form;

		laydate.render({
			elem: '#birthday' //指定元素
			,max: 'new Date()'
		});




	form.on("submit(turnBPM)",function(data){
		var cvid =  $("#uid").val();
		var str =	$("#uid").val() +","+$("#post").val();
 		//弹出loading
		layer.open({
			type : 2,
			title : "选择人员",
			area : [ '400px', '500px' ],
			 content : ctx + "/cv/bpmCLR/"+str
			// data:data
				// + data.uid //这里content是一个普通的String
		})
 		// var index = top.layer.msg('数据提交中，请稍候',{icon: 16,time:false,shade:0.8});
 		// var msg;
 		// $.ajax({
    	// 	type: "post",
        //     url: ctx+"/cv/bpmCLR",
		// 	data:data,
		// 	dataType:"json",
		// 	success:function(d){
		// 		if(d.code==0){
		//         	msg="提交成功！";
		// 		}else{
		//         	msg=d.msg;
		// 		}
		// 	}
        // });
 		// setTimeout(function(){
 		// 	top.layer.close(index);
 		// 	top.layer.msg(msg);
 		// 	layer.closeAll("iframe");
 		// 	//刷新父页面
	 	// 	parent.location.reload();
        // },2000);
 		// return false;
 	})
	
})