<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザ登録完了</title>
</head>
<body>
	<div class="suuccess">
		<h1>ユーザ登録が完了しました。</h1>
		<img src="image/success.png">
		<p>ご登録ありがとうございます。引き続き検索企業システムをお使いください</p>

		<form action="u_loginServlet" method="get">
			<button type="submit">ログイン画面へ</button>
		</form>
	</div>
</body>
</html>