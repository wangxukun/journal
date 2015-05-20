$(function(){
	//单击登录
	$('#loginBtn').click(function(){
		if($("#name").val()==""){
			alert("用户名不能是空");
		}else if($("#password").val()==""){
			alert("密码不能是空");
		}else{
			document.getElementById("loginForm").submit();
		}
	});
});
