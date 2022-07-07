<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>トップページ</title>
</head>
<body>
	<h1>企業検索システム</h1>
	<img src="image/topmenu_icon.png">
	<form action="topmenu" method="post">
		<button type="submit" name="user" value="user">利用者</button>
	</form>
	<form action="topmenu" method="post">
		<button type="submit" value="admin">管理者</button>
	</form>
</body>
</html>