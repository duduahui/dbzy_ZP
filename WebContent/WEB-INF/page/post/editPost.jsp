<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/page/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>添加职位</title>
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
<form class="layui-form" style="width: 80%;" id="auf">
	<!-- 职位id -->
	<input type="hidden" name="uid" value="${post.uid }" id="uid"/>
	<input type="hidden" name="zdeptname" value="${zdeptname }" id="zdeptname"/>
	<input type="hidden" name="zstatus" value="${post.zstatus }" id="zstatus"/>
	<div class="layui-form-item">
	</div>

	<div class="layui-form-item">
	<label class="layui-form-label">职位名称</label>
	<div class="layui-input-block">
		<input type="text" id="zname" class="layui-input userName"
			   lay-verify="required" placeholder="请输入名称" name="zname" value="${post.zname}">
	</div>
	</div>

	<div class="layui-form-item">
		<div class="layui-inline">
			<label class="layui-form-label">用人单位</label>
			<div class="layui-input-inline">
				<select  id="zdept" name="zdept" lay-verify="required"  lay-filter="deptFilte" lay-search="">
					<option value="${post.zdept }">${zdeptname }</option>
				</select>
			</div>
		</div>
	</div>
	<div class="layui-form-item">
		<label class="layui-form-label">工作地点</label>
		<div class="layui-input-block">
			<input type="text" id="gzdd" class="layui-input userName"
				   lay-verify="required" placeholder="请输入工作地点" name="gzdd" value="${post.gzdd }">
		</div>
	</div>
	<div class="layui-form-item">
		<label class="layui-form-label">招聘人数</label>
		<div class="layui-input-block">
			<input type="text" id="zprs" name="zprs"  class="layui-input userName"
				   lay-verify="required" placeholder="请输入招聘人数"   value="${post.zprs }">
		</div>
	</div>
	<div class="layui-form-item">
		<label class="layui-form-label">岗位序列</label>
		<%--		<div class="layui-input-block">--%>
		<%--			<input type="required" id="gwxl" name="gwxl" class="layui-input userName"--%>
		<%--				   lay-verify="text" placeholder="请输入岗位序列"  value="">--%>
		<%--		</div>--%>
		<div class="layui-input-block">
			<select name="gwxl" lay-filter="aihao">
				<option value="${post.gwxl }">${post.gwxl }</option>
				<option value="操作岗">操作岗</option>
				<option value="非操作岗">非操作岗</option>
			</select>
		</div>
	</div>
	<div class="layui-form-item">
		<label class="layui-form-label">月薪范围</label>
		<div class="layui-input-block">
			<input type="text" id="yxfw" name="yxfw"  class="layui-input userName"
				   lay-verify="required" placeholder="请输入月薪范围"   value="${post.yxfw }">
		</div>
	</div>
	<div class="layui-form-item">
		<label class="layui-form-label">学历要求</label>
		<div class="layui-input-block">
			<input type="text" id="xlyq" name="xlyq"  class="layui-input userName"
				   lay-verify="required" placeholder="请输入学历要求"   value="${post.xlyq }">
		</div>
	</div>
	<div class="layui-form-item">
		<label class="layui-form-label">专业要求</label>
		<div class="layui-input-block">
			<input type="text" id="zyyq" name="zyyq"  class="layui-input userName"
				   lay-verify="required" placeholder="请输入专业要求"   value="${post.zyyq }">
		</div>
	</div>
	<div class="layui-form-item">
		<label class="layui-form-label">工作年限(年)</label>
		<div class="layui-input-block">
			<input type="required" id="gznx" name="gznx" class="layui-input userName"
				   lay-verify="text" placeholder="请输入工作年限"  value="${post.gznx }">
		</div>
	</div>
	<div class="layui-form-item layui-form-text">
		<label class="layui-form-label">岗位职责</label>
		<div class="layui-input-block">
			<textarea placeholder="请输入内容"  id="gwzz" name="gwzz" class="layui-textarea"  >${post.gwzz }</textarea>
		</div>
	</div>
	<div class="layui-form-item layui-form-text">
		<label class="layui-form-label">任职要求</label>
		<div class="layui-input-block">
			<textarea placeholder="请输入内容"  id="rzyq" name="rzyq" class="layui-textarea"  >${post.rzyq }</textarea>
		</div>
	</div>
	<div class="layui-form-item layui-form-text">
		<label class="layui-form-label">福利待遇</label>
		<div class="layui-input-block">
			<textarea placeholder="请输入内容"  id="fldy" name="fldy" class="layui-textarea"  >${post.fldy }</textarea>
		</div>
	</div>
	<div class="layui-form-item">
		<div class="layui-input-block">
			<button class="layui-btn" lay-submit="" lay-filter="editPost">保存</button>
			<button class="layui-btn" lay-submit="" lay-filter="subPost">发布</button>
		</div>
	</div>
</form>
<script type="text/javascript" src="${ctx }/layui/layui.js"></script>
<script type="text/javascript" src="${ctx }/page/post/editPost.js"></script>
</body>
</html>