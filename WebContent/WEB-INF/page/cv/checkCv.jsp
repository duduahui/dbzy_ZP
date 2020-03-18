<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/page/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>查看简历信息</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="${ctx }/layui/css/layui.css" media="all" />
<script>  
        var ctx = "${ctx}";  
    </script> 
<style type="text/css">
.layui-form-item .layui-inline {
	width: 33.333%;
	float: left;
	margin-right: 0;
}

@media ( max-width :1240px) {
	.layui-form-item .layui-inline {
		width: 100%;
		float: none;
	}
}
</style>
</head>
<body class="childrenBody">
	<form class="layui-form" style="width: 80%;">
		<!-- 简历id -->
		<input type="hidden" name="uid" value="${cv.uid }" id="uid"/>
		<div class="layui-form-item">
			<div>
				<label class="layui-form-label">职位编码</label>
				<div class="layui-input-block">
					<input class="layui-input layui-disabled"
						   disabled value="${cv.uid }">
				</div>
			</div>
			<div>
				<label class="layui-form-label">招聘部门</label>
				<div class="layui-input-block">
					<input class="layui-input layui-disabled" id="zwid" name="zwid"
						   disabled value="${cv.zwid }">
				</div>
			</div>
		<div class="layui-form-item">
<%--			<label class="layui-form-label">昵称</label>--%>
<%--			<div class="layui-input-block">--%>
<%--				<input type="text" id="nickname" class="layui-input userName"--%>
<%--					lay-verify="required" name="nickname" value="${user.nickname }">--%>
<%--			</div>--%>
<%--		</div>--%>
<%--		<div class="layui-form-item">--%>
<%--			<label class="layui-form-label">性别</label>--%>
<%--			<div class="layui-input-block">--%>
<%--			<c:if test="${user.sex=='0' }">--%>
<%--				<input type="radio" name="sex" value="1" title="男" >--%>
<%--				<input type="radio" name="sex" value="0" title="女" checked> --%>
<%--				<input type="radio" name="sex" value="2" title="保密">--%>
<%--			</c:if>--%>
<%--			<c:if test="${user.sex=='1' }">--%>
<%--				<input type="radio" name="sex" value="1" title="男" checked>--%>
<%--				<input type="radio" name="sex" value="0" title="女" > --%>
<%--				<input type="radio" name="sex" value="2" title="保密">--%>
<%--			</c:if>--%>
<%--			<c:if test="${user.sex=='2' }">--%>
<%--				<input type="radio" name="sex" value="1" title="男" >--%>
<%--				<input type="radio" name="sex" value="0" title="女"> --%>
<%--				<input type="radio" name="sex" value="2" title="保密" checked>--%>
<%--			</c:if>--%>
<%--			</div>--%>
<%--		</div>--%>
<%--		<div class="layui-form-item">--%>
<%--			<label class="layui-form-label">出生日期</label>--%>
<%--			<div class="layui-input-block">--%>
<%--				<input type="text" id="birthday" class="layui-input userName"--%>
<%--					name="birthday" lay-verify="required" placeholder="请输入出生日期" value="${user.birthday }">--%>
<%--			</div>--%>
<%--		</div>--%>
<%--		<div class="layui-form-item">--%>
<%--			<label class="layui-form-label">地址</label>--%>
<%--			<div class="layui-input-block">--%>
<%--				<input type="text" name="address" class="layui-input userName" lay-verify="required" placeholder="请输入地址" value="${user.address }">--%>
<%--			</div>--%>
<%--		</div> --%>
<%--		<div class="layui-form-item">--%>
<%--			<label class="layui-form-label">手机号</label>--%>
<%--			<div class="layui-input-block">--%>
<%--				<input type="text" name="phone" class="layui-input userName"--%>
<%--					lay-verify="phone" placeholder="请输入手机号" value="${user.phone }">--%>
<%--			</div>--%>
<%--		</div>--%>
<%--		<div class="layui-form-item">--%>
<%--			<label class="layui-form-label">用户状态</label>--%>
<%--			<div class="layui-input-block">--%>
<%--				<select name="status" class="" id="status">--%>
<%--					<c:if test="${user.status=='0' }">--%>
<%--						<option value="0" selected="selected">未激活</option>--%>
<%--						<option value="1">正常</option>--%>
<%--						<option value="2">禁用</option>--%>
<%--					</c:if>--%>
<%--					<c:if test="${user.status=='1' }">--%>
<%--						<option value="0">未激活</option>--%>
<%--						<option value="1" selected="selected">正常</option>--%>
<%--						<option value="2">禁用</option>--%>
<%--					</c:if>--%>
<%--					<c:if test="${user.status=='2' }">--%>
<%--						<option value="0">未激活</option>--%>
<%--						<option value="1">正常</option>--%>
<%--						<option value="2" selected="selected">禁用</option>--%>
<%--					</c:if>--%>
<%--				</select>--%>
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn" lay-submit="" lay-filter="subCv">提交</button>
			</div>
		</div>
	</form>
	<script type="text/javascript" src="${ctx }/layui/layui.js"></script>
	<script type="text/javascript" src="${ctx }/page/cv/checkCv.js"></script>
</body>
</html>