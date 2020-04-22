<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ include file="/WEB-INF/page/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>简历列表</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport"
		  content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="Cache-Control" content="no-cache, must-revalidate">
	<meta http-equiv="expires" content="Wed, 26 Feb 1997 08:21:57 GMT">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="${ctx }/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="${ctx }/css/font_eolqem241z66flxr.css"
		  media="all" />
	<link rel="stylesheet" href="${ctx }/css/list.css" media="all" />
	<script>
		var ctx = "${ctx}";
	</script>
</head>
<body class="childrenBody">
<form class="layui-form">
	<input type="hidden" name="postcvid" value="${postcvid}" id="postcvid"/>
<%--	<input type="hidden" name="cvid" value="${cvid }" id="cvid"/>--%>
	<blockquote class="layui-elem-quote news_search">
			<div>
				<div class="layui-inline">
					<div class="layui-input-inline">
						<input type="text" id="nickname" value="" placeholder="请输入姓名或工号"
							   class="layui-input search_input">
					</div>
<%--					<a class="layui-btn search_btn" lay-submit="" data-type="search"--%>
<%--					   lay-filter="search">查询</a>--%>
					<a class="layui-btn layui-btn-normal search">查询</a>
					<a class="layui-btn layui-btn-normal turnBPM">提交</a>
					<div class="layui-inline">（支持模糊查询）</div>
				</div>
			</div>
	</blockquote>
</form>
<div class="layui-form">
	<table id="psnList" lay-filter="psnList"></table>
</div>
<script type="text/javascript" src="${ctx }/layui/layui.js"></script>
<script type="text/javascript" src="${ctx }/page/bpm/bpmCLR.js"></script>
</body>
</html>