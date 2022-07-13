
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログインエラー</title>
</head>
<body>
	<div class="login_err">
		<p><img src="image/login_err_icon.png">
		<h1>ログインに失敗しました。</h1>
		<p>処理に問題が発生しました。</p>
		<p>お手数ですが、再度お試しください。</p>
		<form action="topmenuServlet" method="get">
			<button type="submit">戻る</button>
		</form>
	</div>
</body>
</html>