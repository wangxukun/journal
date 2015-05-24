/**
 * 
 */
$(document).ready(function() {
	$("#addUser").click(function(){
		//检查此tab项是否存在
		var isExists = $("#mainTab").tabs('exists','增加用户');
		if(!isExists){
			$("#mainTab").tabs('add',{
				fit: true,
				title: '增加用户',
				href: 'CountyAdduser',
				closable: true
			});
		}
	});
});