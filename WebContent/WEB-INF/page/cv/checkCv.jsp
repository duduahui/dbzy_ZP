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
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<title>[简历详情]</title>
<script>
	function loading() {
		document.getElementsByClassName('avatar')[0].style.display = 'block';
		document.getElementsByClassName('loading')[0].style.display = 'none';
	}
</script>
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
	<form class="layui-form" style="width: 80%;">
		<!-- 简历id -->
	<input type="hidden" name="uid" value="${cv.uid }" id="uid"/>
<%--	<script type="text/javascript" src="${ctx }/layui/layui.js"></script>--%>
<%--	<script type="text/javascript" src="${ctx }/page/cv/checkCv.js"></script>--%>
<%--	<header class="header"></header>--%>

	<article class="container">
		<section class="side" id="side">
			<!-- 个人肖像 -->
			<section class="me">
				<section class="portrait">
					<!-- 头像照片 -->
<%--					<img class="avatar" src="${ctx }/assets/images/avatar.jpg" onload="loading()">--%>
<%--					<img class="avatar" src="${ctx }/assets/images/tx.jpg" >--%>
					<img  class="avatar" src="${ctx }/assets/images/tx.jpg" >
				</section>

				<h1 class="name">${cv.nickname }</h1>
				<h4 class="info-job">应聘：${cv.nickname }</h4>

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
			<!-- 技能点 -->
<%--			<section class="skill info-unit">--%>
<%--				<h2>--%>
<%--					<i class="fa fa-code" aria-hidden="true"></i>技能点</h2>--%>
<%--				<hr/>--%>
<%--				<ul>--%>
<%--					<li>--%>
<%--						<label>HTML</label>--%>
<%--						<progress value="90" max="100"></progress>--%>
<%--					</li>--%>
<%--					<li>--%>
<%--						<label>CSS</label>--%>
<%--						<progress value="85" max="100"></progress>--%>
<%--					</li>--%>
<%--					<li>--%>
<%--						<label>JavaScript</label>--%>
<%--						<progress value="85" max="100"></progress>--%>
<%--					</li>--%>
<%--					<li>--%>
<%--						<label>React</label>--%>
<%--						<progress value="85" max="100"></progress>--%>
<%--					</li>--%>
<%--					<li>--%>
<%--						<label>Node.js</label>--%>
<%--						<progress value="70" max="100"></progress>--%>
<%--					</li>--%>
<%--					<li>--%>
<%--						<label>小程序</label>--%>
<%--						<progress value="70" max="100"></progress>--%>
<%--					</li>--%>
<%--				</ul>--%>
<%--			</section>--%>

<%--			<section class="qrcode info-unit">--%>
<%--				<h2><i class="fa fa-qrcode" aria-hidden="true"></i>二维码</h2>--%>
<%--				<hr/>--%>
<%--				<img src="https://github.com/if2er/FeZaoDuKe-Collection/blob/master/ifeees.jpg?raw=true" style="width: 100%;" alt="">--%>
<%--			</section>--%>

			<!-- 技术栈 -->
			<!-- <div class="stack info-unit">
                    <h2><i class="fa fa-code" aria-hidden="true"></i>其他</h2>
                    <hr/>
                    <ul>
                        <li>
                            <label>前端</label>
                            <span>React、jQuery、微信小程序、Bootstrap、SASS、LESS</span>
                        </li>
                        <li>
                            <label>后端</label>
                            <span>Node.js、MySQL、MongoDB、WordPress、ThinkPHP</span>
                        </li>
                        <li>
                            <label>其他</label>
                            <span>Git、SVN、Markdown</span>
                        </li>
                    </ul>
                </div> -->
		</section>

		<section class="main">

			<!-- 教育经历 -->
			<section class="edu info-unit">
				<h2>
					<i class="fa fa-graduation-cap" aria-hidden="true"></i>教育经历</h2>
				<hr/>
				<ul>
					<li>
						<h3>
							<span>XXXX大学 - XXX专业（硕士）</span>
							<time>201X.9-201X.7</time>
						</h3>
						<p>专业排名
							<mark>X/XX</mark>，期间发表国际会议英文摘要X篇，国内核心期刊文章X篇（其中第一作者X篇），获XXX，XXX2次，XXX2次。(此处根据自身情况填写，可以突出自己的亮点，或者跟求职目标相关的内容)</p>
					</li>
					<li>
						<h3>
							<span>XXXX大学 - XXX专业（本科）</span>
							<time>201X.9-201X.7</time>
						</h3>
						<p>专业排名
							<mark>X/XX</mark>，期间发表国内核心期刊文章X篇，三等奖学金X次。</p>
					</li>
				</ul>
			</section>

			<!-- 工作经历 -->
			<section class="work info-unit">
				<h2>
					<i class="fa fa-shopping-bag" aria-hidden="true"></i>工作经历</h2>
				<hr/>
				<ul>
					<li>
						<h3>
							<span>[经历1]XX公司－前端开发工程师（实习）</span>
							<time>2016.X 至 2017.X</time>
						</h3>
						<ul class="info-content">
							<li>深度参与XX项目迭代XX的前端开发工作，独立承担并完成XX、XX、XXXX等功能点的开发，主要维护并修复XX、XX、XX等功能点bug若干。项目采用技术栈
								<mark>React+React Router+Node.js+SASS</mark>，实现
								<mark>前后端完全分离</mark>。</li>
							<li>配合UI和后端，根据产品需求提供H5页面嵌入到后台模板，要求
								<mark>移动端显示正常</mark>。</li>
							<li>主要参与XXXXXXX的静态页面开发工作，要求
								<mark>在支付宝环境下完全兼容</mark>。</li>
						</ul>
					</li>
					<li>
						<h3>
							<span>[经历2]XX－前端开发工程师（实习）</span>
							<time>20XX.10-20XX.7</time>
						</h3>
						<ul class="info-content">
							<li>深度参与公司主线产品「XXXX」的前端开发工作，完成帖子快捷回复、
								<mark>全站图片懒加载</mark>、活动banner、帖子管理（使用Yii框架）等功能。项目采用技术栈phpWind+NAMP。
								<a href="http://itsay.tech/162/" target="_blank">
									<i class="fa fa-link" aria-hidden="true"></i>博客文章</a>。</li>
							<li>主要参与公司产品「XXXX」的前端开发工作，实现接入微博、微信、QQ等
								<mark>第三方账号登录</mark>等功能。项目采用技术栈WordPress+NAMP。</li>
							<li>活动页面的开发（七夕活动、抽奖活动以及承接外包页面）。</li>
							<li>论坛
								<mark>图片增量备份</mark>（CentOS+vsftpd+crontab）
								<a href="#" target="_blank">
									<i class="fa fa-link" aria-hidden="true"></i>博客文章</a>。</li>
						</ul>
					</li>
				</ul>
			</section>

			<!-- 项目经验 -->
<%--			<section class="project info-unit">--%>
<%--				<h2>--%>
<%--					<i class="fa fa-terminal" aria-hidden="true"></i>个人项目</h2>--%>
<%--				<hr/>--%>
<%--				<ul>--%>
<%--					<li>--%>
<%--						<h3>--%>
<%--							<span>[项目1]医学科学数据管理与共享平台</span>--%>
<%--							<span class="link">--%>
<%--                                <a href="#" target="_blank">Demo</a>--%>
<%--                            </span>--%>
<%--							<time>201X.X-201X.X</time>--%>
<%--						</h3>--%>
<%--						<ul class="info-content">--%>
<%--							<li>技术栈：ThinkPHP+MongoDB+Axure</li>--%>
<%--							<li>--%>
<%--								<i class="fa fa-paper-plane-o" aria-hidden="true"></i>--%>
<%--								[目标]实现多类型多来源医学科学数据的提交、管理和共享--%>
<%--								<br/>--%>
<%--								<i class="fa fa-users" aria-hidden="true"></i>--%>
<%--								[团队]同 2 位同专业同学一起--%>
<%--								<br/>--%>
<%--								<i class="fa fa-bars" aria-hidden="true"></i>--%>
<%--								[贡献]完成从--%>
<%--								<mark>“调研-设计-实现-文档”</mark>等工作，主要负责系统原型、功能框架及数据提交流程、元数据及源数据的管理与共享方案的设计以及系统开发等工作--%>
<%--								<br/>--%>
<%--								<i class="fa fa-thumbs-o-up" aria-hidden="true"></i>--%>
<%--								[效果]作品最终取得第三届共享杯国家级竞赛“一等奖” （2/2000）</li>--%>
<%--						</ul>--%>
<%--					</li>--%>
<%--					<li>--%>
<%--						<h3>--%>
<%--							<span>[项目2]肿瘤流行病数据可视化</span>--%>
<%--							<span class="link">--%>
<%--                                <a href="#" target="_blank">Demo</a>--%>
<%--                            </span>--%>
<%--							<time>201X.X-201X.X</time>--%>
<%--						</h3>--%>
<%--						<ul class="info-content">--%>
<%--							<li>技术栈：HTML 5+D3.js+ECharts+MySQL</li>--%>
<%--							<li>--%>
<%--								<i class="fa fa-paper-plane-o" aria-hidden="true"></i>--%>
<%--								[目标]实现常见肿瘤流行病数据多维度可视化展示、数据透视及分析--%>
<%--								<br/>--%>
<%--								<i class="fa fa-users" aria-hidden="true"></i>--%>
<%--								[团队]与 1 位同学--%>
<%--								<br/>--%>
<%--								<i class="fa fa-bars" aria-hidden="true"></i>--%>
<%--								[贡献]分析项目需求，清洗并整理相关数据(扩展第三方知识组织系统和 Google trends 数据)，并用--%>
<%--								<mark>D3.js</mark> 和--%>
<%--								<mark>ECharts</mark> 进行图形化展示以及实现简易自动分析 功能--%>
<%--								<br/>--%>
<%--								<i class="fa fa-thumbs-o-up" aria-hidden="true"></i>--%>
<%--								[效果]作品取得第二届共享杯国家级竞赛“特等奖”(1/1500)--%>
<%--							</li>--%>
<%--						</ul>--%>
<%--					</li>--%>
<%--					<li>--%>
<%--						<h3>--%>
<%--							<span>[项目3]肿瘤流行病数据可视化</span>--%>
<%--							<span class="link">--%>
<%--                                <a href="#" target="_blank">Demo</a>--%>
<%--                            </span>--%>
<%--							<time>201X.X-201X.X</time>--%>
<%--						</h3>--%>
<%--						<ul class="info-content">--%>
<%--							<li>技术栈：HTML 5+D3.js+ECharts+MySQL</li>--%>
<%--							<li>--%>
<%--								<i class="fa fa-paper-plane-o" aria-hidden="true"></i>--%>
<%--								[目标]实现常见肿瘤流行病数据多维度可视化展示、数据透视及分析--%>
<%--								<br/>--%>
<%--								<i class="fa fa-users" aria-hidden="true"></i>--%>
<%--								[团队]与 1 位同学--%>
<%--								<br/>--%>
<%--								<i class="fa fa-bars" aria-hidden="true"></i>--%>
<%--								[贡献]分析项目需求，清洗并整理相关数据(扩展第三方知识组织系统和 Google trends 数据)，并用--%>
<%--								<mark>D3.js</mark> 和--%>
<%--								<mark>ECharts</mark> 进行图形化展示以及实现简易自动分析功能--%>
<%--								<br/>--%>
<%--								<i class="fa fa-thumbs-o-up" aria-hidden="true"></i>--%>
<%--								[效果]作品取得第二届共享杯国家级竞赛“特等奖”(1/1500)--%>
<%--							</li>--%>
<%--						</ul>--%>
<%--					</li>--%>
<%--					<li>--%>
<%--						<h3>--%>
<%--							<span>[项目4]肿瘤流行病数据可视化</span>--%>
<%--							<span class="link">--%>
<%--                                <a href="#" target="_blank">Demo</a>--%>
<%--                            </span>--%>
<%--							<time>201X.X-201X.X</time>--%>
<%--						</h3>--%>
<%--						<ul class="info-content">--%>
<%--							<li>技术栈：HTML 5+D3.js+ECharts+MySQL</li>--%>
<%--							<li>--%>
<%--								<i class="fa fa-paper-plane-o" aria-hidden="true"></i>--%>
<%--								[目标]实现常见肿瘤流行病数据多维度可视化展示、数据透视及分析--%>
<%--								<br/>--%>
<%--								<i class="fa fa-users" aria-hidden="true"></i>--%>
<%--								[团队]与 1 位--%>
<%--								<br/>--%>
<%--								<i class="fa fa-bars" aria-hidden="true"></i>--%>
<%--								[贡献]分析项目需求，清洗并整理相关数据(扩展第三方知识组织系统和 Google trends 数据)，并用--%>
<%--								<mark>D3.js</mark> 和--%>
<%--								<mark>ECharts</mark> 进行图形化展示以及实现简易自动分析 功能--%>
<%--								<br/>--%>
<%--								<i class="fa fa-thumbs-o-up" aria-hidden="true"></i>--%>
<%--								[效果]作品取得第二届共享杯国家级竞赛“特等奖”(1/1500)--%>
<%--							</li>--%>
<%--						</ul>--%>
<%--					</li>--%>

<%--				</ul>--%>
<%--			</section>--%>

			<!-- 自我评价 -->
			<section class="work info-unit">
				<h2>
					<i class="fa fa-pencil" aria-hidden="true"></i>自我评价/期望</h2>
				<hr/>
				<p>[此处如果有一些能够量化的、且比较个性的指标会有加分，比如喜爱跑步坚持夜跑200小时或者200km等]
					<span class="mark-txt">“多静多思考，反省不张扬”</span>是我给自己总结的“十字箴言”，鞭策自己做人既不能以己度人，也不以人观己，要脚踏实地做事，坚持自己的梦想和本心。</p>
			</section>
		</section>
	</article>



	<footer class="footer">
<%--		<p>© 2020 文档最后更新时间为--%>
<%--			<time>2018年06月20日</time>.</p>--%>
	</footer>

	<!-- 侧栏 -->
<%--	<aside>--%>
<%--		<ul>--%>
<%--			<li>--%>
<%--				<a href="#" target="_blank">下载</a>--%>
<%--			</li>--%>
<%--			<li>--%>
<%--				<a href="http://if2er.com/" target="_blank">Blog</a>--%>
<%--			</li>--%>
<%--		</ul>--%>
<%--	</aside>--%>
<%--	<script src="./assets/js/index.js"></script>--%>
</body>
</html>