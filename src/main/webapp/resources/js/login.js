/**
 * 登陆页面相应的js
 */

$(function() {
	
	//公司名称

	// 登录界面
	$('#login').dialog({
		title : '登录后台',
		width : 400,
		height : 230,	
		iconCls : 'icon-login',
		buttons : '#btn',
		closed : false,    
	    modal : true
	});

	// 管理员帐号验证
	$('#username').validatebox({
		required : true,
		missingMessage : '请输入管理员帐号',
		invalidMessage : '管理员帐号不得为空',
	});

	// 管理员密码验证
	$('#password').validatebox({
		required : true,
		validType : 'length[6,30]',
		missingMessage : '请输入管理员密码',
		invalidMessage : '管理员密码不得为空',
	});

	// 加载时判断验证
	if (!$('#username').validatebox('isValid')) {
		$('#username').focus();
	} else if (!$('#password').validatebox('isValid')) {
		$('#password').focus();
	}

	// 单击登录
	$('#btn a').click(
			function() {
				if (!$('#username').validatebox('isValid')) {
					$('#username').focus();
				} else if (!$('#password').validatebox('isValid')) {
					$('#password').focus();
				} else {
					$.ajax({
						url : 'admin/login',
						type : 'post',
						data : {
							username : $('#username').val(),
							password : $('#password').val(),
						},
						beforeSend : function() {
							$.messager.progress({
								text : '正在登录中...',
							});
						},
						success : function(data, response, status) {
							$.messager.progress('close');

							if (data > 0) {
								location.href = 'admin/list';
							} else {
								$.messager.alert('登录失败！', '用户名或密码错误！',
										'warning', function() {
											$('#password').select();
										});
							}
						}
					});
				}
			});

});