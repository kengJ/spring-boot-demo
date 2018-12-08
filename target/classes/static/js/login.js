$(function() {
	// Waves初始化
	Waves.displayEffect();
	// 输入框获取焦点后出现下划线
	$('.form-control').focus(function() {
		$(this).parent().addClass('fg-toggled');
	}).blur(function() {
		$(this).parent().removeClass('fg-toggled');
	});
});
Checkbix.init();
$(function() {
	// 点击登录按钮
	$('#login-bt').click(function() {
		login();
	});
	// 回车事件
	$('#username, #password').keypress(function (event) {
		if (13 == event.keyCode) {
			login();
		}
	});
});
// 登录
/**function login() {
	$.ajax({
		url: BASE_PATH + 'login',
		type: 'POST',
		data: {
			username: $('#username').val(),
			password: $('#password').val(),
			rememberMe: $('#rememberMe').is(':checked'),
			backurl: BACK_URL
		},
		beforeSend: function() {

		},
		success: function(json){
			if (json.code == 1) {
				location.href = json.data;
			} else {
				if (10101 == json.code) {
					$('#username').focus();
				}
				if (10102 == json.code) {
					$('#password').focus();
				}
			}
		},
		error: function(error){
			console.log(error);
		}
	});
}**/

/**
 * 功能描述: <br>
 * 〈〉
 * 替换原有登录函数,讲ajax请求改为form提交
 * @param null
 * @return:
 * @since: 1.0.0
 * @Author:heyanzhu
 * @Date: 2018/11/29 15:33
 */
function login(){
$('#loginBox').submit();
}