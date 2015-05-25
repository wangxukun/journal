<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE HTML>
<html>
<head>
</head>
<body>
	<div style="width:400px;height:100%;margin:0 auto;">
	<div style="padding: 60px 60px 20px 60px"></div>
	<div id="county_adduser_panel" class="easyui-panel" title="增加用户" style="width:400px;">
		<div style="padding: 10px 60px 20px 60px">
			<form id="ff" method="post" action="${pageContext.request.contextPath }/servlet/AddUserServlet">
				<input type="hidden" name="id" value="${userinfo.userid}" />
				<input type="hidden" name="parentid" value="${userinfo.userparentid}" />
				<input type="hidden" name="grade" value="${userinfo.usergrade}" />
				<table cellpadding="5">
					<tr>
						<td>姓名：</td>
						<td><input class="easyui-textbox" type="text" name="name"
							data-options="required:true"></input></td>
					</tr>
					<tr>
						<td>密码：</td>
						<td><input class="easyui-textbox" type="password" name="password"
							data-options="required:true"></input></td>
					</tr>
					<tr>
						<td>确认密码：</td>
						<td><input class="easyui-textbox" type="password" name="repassword"
							data-options="required:true"></input></td>
					</tr>
					<tr>
						<td>单位：</td>
						<td><input class="easyui-textbox" type="text" name="organization" 
							data-options="required:true"></input></td>
					</tr>
					<tr>
						<td>Email：</td>
						<td><input class="easyui-textbox" type="text" name="email"
							data-options="validType:'email'"></input></td>
					</tr>
					<tr>
						<td>电话：</td>
						<td><input class="easyui-textbox" type="text" name="phone"></input></td>
					</tr>
				</table>
			</form>
			<div style="text-align: center; padding: 5px">
				<a href="javascript:void(0)" class="easyui-linkbutton"
					onclick="submitForm()">提交</a>
				<a href="javascript:void(0)"
					class="easyui-linkbutton" onclick="clearForm()">清除</a>
			</div>
		</div>
		</div>
		</div>
	<script>
        function submitForm(){
            $('#ff').form('submit');
        }
        function clearForm(){
            $('#ff').form('clear');
        }
    </script>
</body>
</html>
