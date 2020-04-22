var $;
var $form;
var form;
layui
	.config({
		base : "js/"
	})
	.use(
		[ 'form', 'layer', 'jquery', 'table', 'laydate' ],
		function() {
			var form = layui.form, table = layui.table, layer = parent.layer === undefined ? layui.layer
				: parent.layer, laydate = layui.laydate
			$ = layui.jquery,
				nowTime = new Date().valueOf(),
				max = null,
				active = {
					search : function() {
						var zwid = $('#zwid'),
							nickname = $('#nickname'),
							createTimeStart = $("#createTimeStart"),
							createTimeEnd = $("#createTimeEnd");
						//执行重载
						table
							.reload(
								'cvList',
								{
									page : {
										curr : 1
										//重新从第 1 页开始
									},
									where : {
										//key: {
										zwid : zwid
											.val(),
										nickname : nickname
											.val(),
										createTimeStart : createTimeStart
											.val(),
										createTimeEnd : createTimeEnd
											.val()
										//}
									}
								});
					}
				};

			var start = laydate.render({
				elem : '#createTimeStart',
				type : 'datetime',
				max : nowTime,
				btns : [ 'clear', 'confirm' ],
				done : function(value, date) {
					endMax = end.config.max;
					end.config.min = date;
					end.config.min.month = date.month - 1;
				}
			});
			var end = laydate.render({
				elem : '#createTimeEnd',
				type : 'datetime',
				max : nowTime,
				done : function(value, date) {
					if ($.trim(value) == '') {
						var curDate = new Date();
						date = {
							'date' : curDate.getDate(),
							'month' : curDate.getMonth() + 1,
							'year' : curDate.getFullYear()
						};
					}
					start.config.max = date;
					start.config.max.month = date.month - 1;
				}
			})
			//加载页面数据
			table
				.render({
					id : 'cvList',
					elem : '#cvList',
					url : ctx + '/cv/getRckCvList/'+$('#zwid').val() //数据接口
					,cellMinWidth: 100 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
					,limit : 10//每页默认数
					,
					limits : [ 10, 20, 30, 40 ],
					cols : [ [ //表头
						{
							type : 'checkbox', fixed: true
						},
						{
							title : '操作',
							toolbar : '#barEdit',
							width: 80
						},
						{
							field : 'uid',
							title : '序号'
						},
						{
							field : 'cvid',
							title : '简历编号'
						},
						{
							field : 'nickname',
							title : '姓名'
						},{
							field : 'zwid',
							title : '职位编号'

						},
						{
							field : 'zname',
							title : '应聘职位'

						},
						{
							field : 'gzdd',
							title : '工作地点'
						},
						{
							field : 'age',
							title : '年龄'
						},
						{
							field : 'xueli',
							title : '学历'
						},
						{
							field : 'byyx',
							title : '毕业院校'
						},
						{
							field : 'lxgznx',
							title : '连续工作年限'
						},
						{
							field : 'createtime',
							title : '投递时间',
							templet : '<div>{{ formatTime(d.createtime,"yyyy-MM-dd hh:mm:ss")}}</div>'
						},
						{
							field : 'cvstatusname',
							title : '简历状态',
							sort: true,
							width: 110
						},
						{
							field : 'cvstatus',
							title : '简历状态',
							sort: true,
							width: 110
						},
						{
							field : 'clstatus',
							title : '状态处理',
							toolbar: '#switchTpl',
							width: 290
						}] ],
					page : true
					,where: {timestamp: (new Date()).valueOf()}
					//开启分页
					,done:function(res,curr,count){
						// 隐藏列
						$(".layui-table-box").find("[data-field='uid']").css("display","none");
						$(".layui-table-box").find("[data-field='cvid']").css("display","none");
						$(".layui-table-box").find("[data-field='zwid']").css("display","none");
						$(".layui-table-box").find("[data-field='cvstatus']").css("display","none");
						// $(".layui-table-box").find("[data-field='cvstatus']").css("display","none");
					}
				});





			$('.demoTable .layui-btn').on('click', function(){
				var type = $(this).data('type');
				active[type] ? active[type].call(this) : '';
			});
			//监听状态操作

			form.on('radio(jlcz)', function (data) {
				console.log(data)
				// alert(this.id+"=="+this.name+"=="+data.value );
				$.ajax({
					url : ctx + "/cv/updCvs/"+this.name+","
						+ data.value,
					type : "get",
					success : function(d) {
						if (d.code == 0) {
							// obj.del();
						} else {
							layer.msg(data.msg, {
								icon : 5
							});
						}
					}
				})
			});
			//监听排序
			table.on('sort(cvList)', function(obj) {
				table.reload('cvList', {
					initSort: obj
				});
			});
			table.reload('cvList', {});

			//监听工具条
			table.on('tool(cvList)', function(obj) {
				var data = obj.data;
				if (obj.event === 'del') {
					layer.confirm('真的删除行么', function(index) {
						$.ajax({
							url : ctx + '/user/delUserByUid/'
								+ data.uid,
							type : "get",
							success : function(d) {
								if (d.code == 0) {
									obj.del();
								} else {
									layer.msg(data.msg, {
										icon : 5
									});
								}
							}
						})
						layer.close(index);
					});
				}
				else if (obj.event === 'check') {
					var index = layui.layer.open({
						title : "简历详情",
						type : 2,
						content : ctx + "/cv/checkCv/"+ data.uid+","+data.zwid,
						success : function(layero, index) {

						}
					})
					//改变窗口大小时，重置弹窗的高度，防止超出可视区域（如F12调出debug的操作）
					$(window).resize(function() {
						layui.layer.full(index);
					})
					layui.layer.full(index);
				}
				else if (obj.event === 'turn') {
					layer.open({
						type : 2,
						title : "转发简历",
						area : [ '800px', '500px' ],
						// content : ctx + "/cv/turnCv/"
						content : ctx + "/post/cv2postList/"
							+ data.uid //这里content是一个普通的String
					})
				}

			});

			//查询
			$(".search_btn").click(function() {
				var type = $(this).data('type');
				active[type] ? active[type].call(this) : '';
			})

			//添加文章
			$(".userAdd_btn").click(function() {
				var index = layui.layer.open({
					title : "添加文章",
					type : 2,
					content : ctx + "/user/addUser",
					success : function(layero, index) {

					}
				})
				//改变窗口大小时，重置弹窗的高度，防止超出可视区域（如F12调出debug的操作）
				$(window).resize(function() {
					layui.layer.full(index);
				})
				layui.layer.full(index);
			})

			//批量删除
			$(".batchDel")
				.click(
					function() {
						var checkStatus = table
							.checkStatus('userList'), data = checkStatus.data, userStr = '';
						if (data.length > 0) {
							$.each(data, function(n,
												  value) {
								userStr += value.uid
									+ ',';
							});
							userStr = userStr
								.substring(
									0,
									userStr.length - 1);
							layer
								.confirm(
									'确定删除<strong>'
									+ data.length
									+ '</strong>条数据吗？',
									function(
										index) {
										//调用删除接口
										$
											.ajax({
												url : ctx
													+ '/user/delUsers/'
													+ userStr,//接口地址
												type : "get",
												success : function(
													d) {
													if (d.code == 0) {
														//删除成功，刷新父页面
														parent.location
															.reload();
													} else {
														layer
															.msg(
																"权限不足，联系超管！",
																{
																	icon : 5
																});
													}
												}
											})
									});
						} else {
							layer.msg("请选择需要删除的用户");
						}
					})

		})

//格式化时间
function formatTime(datetime, fmt) {
	if (datetime == null || datetime == 0) {
		return "";
	}
	if (parseInt(datetime) == datetime) {
		if (datetime.length == 10) {
			datetime = parseInt(datetime) * 1000;
		} else if (datetime.length == 13) {
			datetime = parseInt(datetime);
		}
	}
	datetime = new Date(datetime);
	var o = {
		"M+" : datetime.getMonth() + 1, //月份
		"d+" : datetime.getDate(), //日
		"h+" : datetime.getHours(), //小时
		"m+" : datetime.getMinutes(), //分
		"s+" : datetime.getSeconds(), //秒
		"q+" : Math.floor((datetime.getMonth() + 3) / 3), //季度
		"S" : datetime.getMilliseconds()
		//毫秒
	};
	if (/(y+)/.test(fmt))
		fmt = fmt.replace(RegExp.$1, (datetime.getFullYear() + "")
			.substr(4 - RegExp.$1.length));
	for ( var k in o)
		if (new RegExp("(" + k + ")").test(fmt))
			fmt = fmt.replace(RegExp.$1,
				(RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k])
					.substr(("" + o[k]).length)));
	return fmt;
}
