$(function(){
	//单击登录
	$('#loginBtn').click(function(){
		if($("#name").val()==""){
			alert("用户名不能是空");
			$("#name").focus();
			return false;
		}
		if($("#password").val()==""){
			alert("密码不能是空");
			$("#password").focus();
			return false;
		}
	});
});
