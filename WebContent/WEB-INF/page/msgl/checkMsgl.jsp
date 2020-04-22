<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/page/include/taglib.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<title>[面试详情]</title>
<link rel="stylesheet" href="${ctx }/layui/css/layui.css" media="all" />
<link rel="shortcut icon" href="${ctx }/assets/images/favicon.ico" type="image/x-icon">
<link rel="stylesheet" href="${ctx }/assets/css/typo.css">
<link rel="stylesheet" href="${ctx }/assets/css/font-awesome.min.css">
<link rel="stylesheet" href="${ctx }/assets/css/index.css">
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
		<!-- 简历id -->
	<input type="hidden" name="uid" value="${cv.uid }" id="uid"/>
	<input type="hidden" name="postcvid" value="${postcvid }" id="postcvid"/>
	<script type="text/javascript" src="${ctx }/layui/layui.js"></script>
	<script type="text/javascript" src="${ctx }/page/msgl/checkMsgl.js"></script>
<%--	<header class="header"></header>--%>

	<article class="container">
		<section class="side" id="side">
			<!-- 个人肖像 -->
			<section class="me">
				<!-- 头像照片 -->
				<img  class="portrait" src="${ctx }/assets/images/tx.jpg" >
				<h1 class="name">${cv.nickname }</h1>
<%--				<h4 class="info-job">应聘：${cv.nickname }</h4>--%>
			</section>

			<!-- 基本信息 -->
			<section class="profile info-unit">
				<h2>
					<i class="fa fa-user" aria-hidden="true"></i>基本信息</h2>
				<hr/>
				<ul>
					<li>
						<label>个人信息</label>
						<span>${cv.nickname } / ${cv.sex } / 24岁</span>
					</li>
					<li>
						<label>婚姻状况</label>
						<span>${cv.hyzk }</span>
					</li>
					<li>
						<label>政治面貌</label>
						<span>${cv.zzmm }</span>
					</li>
					<li>
						<label>现居住地</label>
						<span>${cv.xjzd }</span>
					</li>
					<li>
						<label>身份证</label>
						<span>${cv.sfz }</span>
					</li>
					<li>
						<label>身高(cm)</label>
						<span>${cv.shengao }</span>
					</li>
					<li>
						<label>最快到岗时间</label>
						<span>${cv.dgsj }</span>
					</li>
				</ul>
			</section>

			<!-- 联系方式 -->
			<section class="contact info-unit">
				<h2>
					<i class="fa fa-phone" aria-hidden="true"></i>联系方式</h2>
				<hr/>
				<ul>
					<li>
						<label>手机</label>
						<a href="" target="_blank">${cv.phone}</a>
					</li>
					<li>
						<label>邮箱</label>
						<a href="" target="_blank">ze.zh@hotmail.com</a>
					</li>
				</ul>
			</section>
			<!-- 专业技能 -->
			<section class="skill info-unit">
				<h2>
					<i class="fa fa-code" aria-hidden="true"></i>专业技能</h2>
				<hr/>
				<ul>
					<li>
						<label>毕业院校</label>
						<span >${cv.byyx }</span>
					</li>
					<li>
						<label>所学专业</label>
						<span>${cv.sxzy }</span>
					</li>
					<li>
						<label>学历</label>
						<span>${cv.xueli }</span>
					</li>
					<li>
						<label>学位</label>
						<span>${cv.xuewei }</span>
					</li>
					<li>
						<label>英语水平</label>
						<span>${cv.yysp }</span>
					</li>
					<li>
						<label>职称(技能)等级</label>
						<span>${cv.zcdj }</span>
					</li>
				</ul>
			</section>
		</section>

		<section class="main">

			<!-- 教育经历 -->
			<section class="edu info-unit" id="jy">
				<h2>
					<i class="fa fa-graduation-cap" aria-hidden="true"></i>教育经历</h2>
				<hr/>
				<ul>
				<c:forEach items="${cvjy}" var="TbCvsJy" varStatus="status">
					<li>
						<h3>
							<span>${TbCvsJy.school} - ${TbCvsJy.zhuanye}  (${TbCvsJy.xueli})</span>
						</h3>
							<span><time>${TbCvsJy.column1} </time></span>

							<span><time>至 ${TbCvsJy.column2}</time></span>

<%--						<p>工作描述：--%>
<%--							<mark>X/XX</mark>(此处根据自身情况填写，可以突出自己的亮点，或者跟求职目标相关的内容)--%>
<%--						</p>--%>
					</li>
				</c:forEach>
				</ul>
			</section>

			<!-- 工作经历 -->
			<section class="work info-unit">
				<h2>
					<i class="fa fa-shopping-bag" aria-hidden="true"></i>工作经历</h2>
				<hr/>
				<ul>
				<c:forEach items="${cvgz}" var="TbCvsGz" varStatus="status">
					<li>
						<h3>
							<span>${TbCvsGz.gzdw}－${TbCvsGz.zhiwu}</span>
						</h3>
						<span><time>${TbCvsGz.column1} </time></span>
						<span><time>至 ${TbCvsGz.column2}</time></span>

						<ul class="info-content">
							<li>薪酬待遇：${TbCvsGz.xcdy}（元/月）</li>
							<li>${TbCvsGz.gzms}</li>
						</ul>
					</li>
					</c:forEach>
				</ul>
			</section>

			<!-- 培训经历 -->
			<section class="project info-unit">
				<h2>
					<i class="fa fa-hashtag" aria-hidden="true"></i>培训经历</h2>
				<hr/>
				<ul>
					<c:forEach items="${cvpx}" var="TbCvsPx" varStatus="status">
					<li>
						<h3>
							<span>${TbCvsPx.pxjg}</span>
						</h3>
						<span><time>${TbCvsPx.column1} </time></span>
						<span><time>至 ${TbCvsPx.column2}</time></span>
						<ul class="info-content">
							<li>培训证书：${TbCvsPx.pxzs}</li>
						</ul>
					</li>
					</c:forEach>
				</ul>
			</section>

			<section class="profile info-unit">
				<h2>
					<i class="fa fa-user" aria-hidden="true"></i>面试反馈</h2>
				<hr/>
				<ul>
					<table border="0" cellspacing="1" cellpadding="10" align="center">
						<tr>
							<th width="18%"><span>面试环节</span></th>
							<th width="14%">面试官</th>
							<th width="26%">面试评价</th>
							<th width="20%">面试时间</th>
						</tr>

					<c:forEach items="${pj}" var="pj" varStatus="status">
						<tr><td>
							<span>${pj.pjstatus }</span>
						</td>
							<td>
							<span>${pj.pjname }</span>
						</td><td>
							<span>${pj.pjdesc }</span>
						</td><td>
								<span><fmt:formatDate value="${pj.pjdate}" pattern="yyyy-MM-dd" />
							</td>
						</tr>
					</c:forEach>
					</table>
				</ul>
			</section>
		</section>


	</article>

	<footer class="footer">
<%--		<p>© 2020 文档最后更新时间为--%>
<%--			<time>2018年06月20日</time>.</p>--%>

	</footer>
		<!-- 侧栏 -->
		<aside>
			<ul>
				<li>
					<%--				<a href="#" target="_blank" style="width: 100px">启动BPM流程</a>--%>
					<button class="layui-btn" lay-submit="" lay-filter="turnBPM">安排面试</button>
				</li>
				<%--			<li>--%>
				<%--                <button class="layui-btn" lay-submit="" lay-filter="downLoad">下载</button>--%>
				<%--            </li>--%>
			</ul>
		</aside>
    </form>
</body>
</html>