<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE HTML>
<html>
<head>
</head>
<body>
	<div style="width:400px;height:100%;margin:0 auto;">
	<div style="padding: 60px 60px 20px 60px"></div>
	<div id="county_adduser_panel" class="easyui-panel" title="权限设置" style="width:400px;">
		<div style="padding: 10px 60px 20px 60px">
			
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
