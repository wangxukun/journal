<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<HTML>
<HEAD>
<TITLE>用户登录</TITLE>
<LINK href="${pageContext.request.contextPath }/images/xtree.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/User_Login.css" type=text/css rel=stylesheet>

<script src="${pageContext.request.contextPath }/jquery/jquery-2.1.4.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/jquery/jquery-ui.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/easyui/jquery.easyui.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/js/login.js" type="text/javascript" ></script>
</HEAD>
<BODY id=userlogin_body>
	<DIV id=loginTitle>
		<h1>银行存款日记账管理系统</h1>
	</DIV>
	<form id="loginForm" action="${pageContext.request.contextPath }/servlet/LoginServlet" method="post">
	<DIV id=user_login>
		<DL>
			<DD id=user_top>
				<UL>
					<LI class=user_top_l></LI>
					<LI class=user_top_c></LI>
					<LI class=user_top_r></LI>
				</UL>
			</DD>
			<DD id=user_main>
				<UL>
					<LI class=user_main_l></LI>
					<LI class=user_main_c>
						<DIV class=user_main_box>
							<UL>
								<LI class=user_main_text>用户名：</LI>
								<LI class=user_main_input><INPUT class=TxtUserNameCssClass
									id=name maxLength=20 name=name></LI>
							</UL>
							<UL>
								<LI class=user_main_text>密码：</LI>
								<LI class=user_main_input><INPUT class=TxtPasswordCssClass
									id=Password type=password name=Password></LI>
							</UL>
							<UL>
								<LI class=user_main_text>记住登录：</LI>
								<LI class=user_main_input><SELECT id=DropExpiration
									name=DropExpiration>
										<OPTION value=None selected>不保存</OPTION>
										<OPTION value=Day>保存一天</OPTION>
										<OPTION value=Month>保存一月</OPTION>
										<OPTION value=Year>保存一年</OPTION>
								</SELECT></LI>
							</UL>
						</DIV>
					</LI>
					<LI class=user_main_r>
						<INPUT class=IbtnEnterCssClass id=loginBtn style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px"
						onclick='javascript:(0)' type=image src="${pageContext.request.contextPath }/images/user_botton.gif" name=IbtnEnter></LI>
				</UL>
		</DL>
	</DIV>
	</FORM>
	<DIV></DIV>

	
</BODY>
</HTML>
