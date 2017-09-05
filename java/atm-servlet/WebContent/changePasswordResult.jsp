<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>ATM-修改密码</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="keywords" content="实训,教育,IT">
<meta name="description" content="轻实训ATM案例">
<meta name="author" content="轻实训">
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body>
	<div id="atmMain" class="atm-main">
		<form action="changePassword" method="post"
			onsubmit="return validateChangePassword();">
			<div class="main-left">
				<ul class="menu">
					<li>
						<button type="button" onclick="returnMain();">返回</button>
					</li>
				</ul>
			</div>
			<div class="main-content">
				<h3>密码更改成功</h3>
			</div>
			<div class="main-right"></div>
		</form>
	</div>
	<script src="js/common.js" type="text/javascript"></script>
</body>

</html>
>
