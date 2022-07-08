<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者ログイン</title>
</head>
<body>
<h1>管理者ログイン</h1>
	<form action="a_menuServlet" method="post">
		管理者ID<br>
		<img src="image/u_login_icon.png">
		<input type="text" name="id"><br>
		<img src="image/u_login_icon2.png">
		<input type="password" name="pass"><br>
		<button type="submit">送信</button>
	</form>

</body>
</html>