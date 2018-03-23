/**
 * @author knightjxnu
 * @returns
 */

var registerUrl = base + "/account/register";

function registerSubmit() {
	userName = document.getElementById("userName").value;
	userPwd = document.getElementById("userPwd").value;
	if (true == checkOut(userName, userPwd)) {
		userPwd = md5(userPwd);
		ajax("post", registerUrl, {
			"userName" : userName,
			"userPwd" : userPwd
		});
	} else {
		alert("账号密码非法！");
	}
}

/**
 * 检测账号、密码是否合法 合法，返回 true 非法，返回 false
 */
function checkOut(userName, userPwd) {
	tempName = trim(userName);
	tempPwd = trim(userPwd);
	if (0 == tempName.length || 0 == tempPwd.length) {
		return false;
	}
	return true;
}

/**
 * 去空格 返回去空格的字符串
 */
function trim(str) {
	return str.replace(/(^\s+)|(\s+$)/g, "");
}

/**
 * ajax请求
 */
function ajax(type, url, data) {
	// 创建ajax对象
	var xhr = null;
	if (window.XMLHttpRequest) {
		xhr = new XMLHttpRequest();
	} else {
		xhr = new ActiveXObject('Microsoft.XMLHTTP')
	}

	var type = type.toUpperCase();
	// 用于清除缓存
	var random = Math.random();

	if (typeof data == 'object') {
		var str = '';
		for ( var key in data) {
			str += key + '=' + data[key] + '&';
		}
		data = str.replace(/&$/, '');
	}

	if (type == 'GET') {
		if (data) {
			xhr.open('GET', url + '?' + data, true);
		} else {
			xhr.open('GET', url + '?t=' + random, true);
		}
		xhr.send();

	} else if (type == 'POST') {
		xhr.open('POST', url, true);
		// 如果需要像 html 表单那样 POST 数据，请使用 setRequestHeader() 来添加 http 头。
		xhr.setRequestHeader("Content-type",
				"application/x-www-form-urlencoded");
		xhr.send(data);
	}

	// 处理返回数据
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4) {
			if (xhr.status == 200) {
				alert(xhr.responseText);
			} else {
				if (failed) {
					alert(xhr.status);
				}
			}
		}
	}
}
