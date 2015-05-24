<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE HTML>
<html>
<head>
<title>主页</title>
<link href="${pageContext.request.contextPath }/css/county.css" type=text/css rel=stylesheet>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/smoothness/jquery-ui.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/smoothness/theme.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyui/themes/metro/easyui.css">

<script src="${pageContext.request.contextPath }/jquery/jquery-2.1.4.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/jquery/jquery-ui.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/easyui/jquery.easyui.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/js/county.js" type="text/javascript" ></script>
</head>
<body class="easyui-layout" id="layout">
<!--+++++++++++++++++++++++++头面板+++++++++++++++++++++++++-->
    <div id="north" data-options="region:'north',title:null,split:false" style="height:100px;">
    	<div id="left">
			<h1>银行存款日记帐</h1>
		</div>
		<div id="right">
			<ul>
				<li>操作员：${userinfo.username }
				<li>单位：${userinfo.organization }
				<li>帐户：${userinfo.accountname }
			</ul>
		</div>
    </div>
<!---------------------------头面板--------------------------->   
    
    
    
    
<!--+++++++++++++++++++++++++脚面板+++++++++++++++++++++++++-->    
    <div data-options="region:'south',title:null,split:true,collapsible:false" style="height:40px;">
    </div>
<!---------------------------脚面板--------------------------->  
    
    
    
    
    
    
    
<!--+++++++++++++++++++++++++左面板+++++++++++++++++++++++++-->    
    <div data-options="region:'west',title:'控制面板',split:true" style="width:200px;">
    
    <!-- O左面板->可折叠面板  -->
	    <div id="aa" class="easyui-accordion" style="width:100%;height:auto;">
		    <div title="系统管理" data-options="iconCls:'icon-man'" style="overflow:auto;padding:10px;">
		        <div id="accordionLeft-1">
					<ul>
						<li id="exit"><a href="servlet/OperatorExit">退出系统</a>
					</ul>
					</div>
				</div>
		    
		    <div title="账户管理" data-options="iconCls:'icon-man'" style="padding:10px;">
		        <div id="accordionLeft-2">
					<ul>
						<li id="addDelAccount"><span>账户管理</span></li>
					</ul>
				</div>
		    </div>
		    
		    <div title="业务处理" data-options="iconCls:'icon-man',selected:true" style="padding:10px;">
		        <div id="accordion-3">
					<ul>
						<li id="dataInit"><span>数据初始化</span></li>
						<li id="dataInput"><span>数据录入</span></li>
						<li id="dataRevise"><span>数据修改</span></li>
						<li id="dataQuery"><span>数据查询</span></li>
						<li>数据汇总
					</ul>
				</div>
		    </div>
		    
		    <div title="用户管理" data-options="iconCls:'icon-man'" style="padding:10px;">
		        <div id="accordion-4">
					<ul>
						<li id="addUser"><span>增加用户</span>
						<li id="delUser"><span>删除用户</span>
					</ul>
				</div>
		    </div>
		</div>
	<!-- C左面板->可折叠面板 -->
    </div>
<!---------------------------左面板--------------------------->    
    
<!--+++++++++++++++++++++++++主体面板+++++++++++++++++++++++++-->    
    <div data-options="region:'center'" style="padding:5px;">
    	<div id="mainTab" class="easyui-tabs" fit=true>
    		<!-- +++++++++++++++++++++++++++首页tab -->
    		<div class="box" title="首页">
				<div class="link link-one" id="one">
					<span class="icon"></span>
					<a href="javasrcipt:void(0)" class="button">
						<span class="line line-top"></span>
						<span class="line line-left"></span>
						<span class="line line-right"></span>
						<span class="line line-bottom"></span>
						数据初始化
					</a>
				</div>
				<div class="link link-two">
					<span class="icon"></span>
					<a href="javasrcipt:void(0)" class="button">
						<span class="line line-top"></span>
						<span class="line line-left"></span>
						<span class="line line-right"></span>
						<span class="line line-bottom"></span>
						数据录入
					</a>
				</div>
				<div class="link link-three">
					<span class="icon"></span>
					<a href="javasrcipt:void(0)" class="button">
						<span class="line line-top"></span>
						<span class="line line-left"></span>
						<span class="line line-right"></span>
						<span class="line line-bottom"></span>
						数据修改
					</a>
				</div>
				<div class="link link-four">
					<span class="icon"></span>
					<a href="javasrcipt:void(0)" class="button">
						<span class="line line-top"></span>
						<span class="line line-left"></span>
						<span class="line line-right"></span>
						<span class="line line-bottom"></span>
						数据查询
					</a>
				</div>
			</div>
			<!-- ---------------------------首页tab -->
    	</div>	
    </div>
<!---------------------------主体面板--------------------------->
</body>
</html>
