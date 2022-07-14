<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "scopedata.Account" %>
<%
   Account account = (Account)session.getAttribute("LoginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録確認</title>
</head>
<body>
     <h2>一度登録すると変更はできません。よろしいですか。</h2><br>
     <form action="u_entry_3" method="post">
     ID<%= account.getId() %><br>
     パスワード<%= account.getPass() %>
	 <input type="submit" value="登録">
     </form>
     <a href="u_loginServlet">戻る</a>
</body>
</html>
