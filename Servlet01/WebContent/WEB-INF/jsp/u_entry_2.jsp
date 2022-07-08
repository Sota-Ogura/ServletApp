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
     ID<%= account.getId() %><br>
     パスワード<%= account.getPass() %>
     <a href="/WEB-INF/jsp/u_entry_1.jsp"></a>
     <a href="Servlet01/u_entry_1.java?action=go"></a>
</body>
</html>
