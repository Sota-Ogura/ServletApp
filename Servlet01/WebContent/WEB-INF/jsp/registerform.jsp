<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザ新規登録画面</title>
</head>
<body>
       <h1>ユーザ新規登録</h1>
     <form action="" method="post">
      ID<br>
      <img src="image/u_login_icon.png">
      <input type="text" name="id" required><br>
      パスワード<br>
      <p>※PASSWDは難しいものを
      <img src="image/u_login_icon2.png">
      <input type="password" name="pw" required><br>
      パスワード確認<br>
      <img src="image/u_login_icon.png">
      <input type="password" name="check" required><br>
      <input type="submit" value="登録する"><a href="Servlet01/u_login.jsp">キャンセル</a>
     </form>
</body>
</html>