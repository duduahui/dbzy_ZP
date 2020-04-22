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
		var uid =  $("#uid").val();
		var pcid = $("#postcvid").val();
		alert(uid+"==="+pcid);
 		//弹出loading
		layer.open({
			type : 2,
			title : "选择人员",
			area : [ '400px', '500px' ],
			 content : ctx + "/cv/bpmCLR/"+pcid
			// data:data
				// + data.uid //这里content是一个普通的String
		})
 	})
	
})