var $;
var form;
layui.config({
	base : "js/"
}).use(['form','layer','jquery','laydate'],function(){
	var layer = parent.layer === undefined ? layui.layer : parent.layer, table = layui.table,
		laydate = layui.laydate;
		$ = layui.jquery;
		form = layui.form;
		laydate.render({
			elem: '#birthday' //指定元素
			,max: 'new Date()'
		});
	//加载页面数据
	table
		.render({
			id : 'pjList',
			elem : '#pjList',
			url : ctx + '/msgl/getpjList/'+$('#zwid').val() //数据接口
			,cellMinWidth: 100 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
			,
			cols : [ [ //表头
				{
					field : 'uid',
					title : '评价人'
				},
				{
					field : 'cvid',
					title : '评价内容'
				},
				{
					field : 'nickname',
					title : '评价时间'
				}] ]
		});

	form.on("submit(turnBPM)",function(data){
		var postcvid =  $("#postcvid").val();
 		//弹出loading
		layer.open({
			type : 2,
			title : "选择人员",
			area : [ '400px', '500px' ],
			 content : ctx + "/cv/bpmCLR/"+postcvid
			// data:data
				// + data.uid //这里content是一个普通的String
		})

 	})
	
})