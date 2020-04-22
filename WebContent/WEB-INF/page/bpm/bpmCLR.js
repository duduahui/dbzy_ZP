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
				active = {}

			//加载页面数据
			table
				.render({
					id : 'psnList',
					elem : '#psnList',
					url : ctx + '/cv/getPsnList/'+$('#nickname').val() //数据接口
					,cellMinWidth: 100 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
					,limit : 10//每页默认数
					,
					limits : [ 10, 20, 30, 40 ],
					cols : [ [ //表头
						{
							type : 'checkbox', fixed: true
						},
                        {
                            field : 'psnname',
                            title : '人员姓名'
                        },
                        {
                            field : 'psncode',
                            title : '人员编码'
                        },
						{
							field : 'deptname',
							title : '部门名称'
						}] ],
					page : true
					,where: {timestamp: (new Date()).valueOf()}
					//开启分页
				});
			//查询
			$(".search").click(function() {
				//执行重载
				table
					.reload(
						'psnList',
						{
							page : {
								curr : 1
								//重新从第 1 页开始
							},
							where : {
								nickname : $('#nickname').val()
							}
						});

			})

			//提交BPM
			$(".turnBPM").click(function() {
				var checkStatus = table
					.checkStatus('psnList'), data = checkStatus.data, postStr = $('#postcvid').val();

				if (data.length > 0) {
					if(data.length == 1){
						postStr += ","+data[0]["psncode"]
						// alert(JSON.stringify(data));
						layer
							.confirm(
								'确认BPM下一步处理人：<strong>'
								+ data[0]["psnname"]
								+ '</strong>',
								function(
									index) {
									//调用转发接口
									$
										.ajax({
											url : ctx
												+ '/cv/subBpm/'
												+ postStr,//接口地址
											type : "get",
											success : function(
												d) {
												console.log(d);
												if (d.code == 0) {
													//提交成功，刷新父页面

													layer
														.msg(
															"提交成功！",
															{
																icon : 1
															});
													// parent.location
													// 	.reload();
												} else {
													layer
														.msg(
															"该流程已提交过！",
															{
																icon : 5
															});
												}
											}
										})
								});
					}else{
						layer.msg("只能选一位员工");
					}

				} else {
					layer.msg("请选择人员");
				}

			})
		})

