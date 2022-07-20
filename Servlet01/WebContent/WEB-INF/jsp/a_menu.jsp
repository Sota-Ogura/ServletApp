<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者メニュー</title>
</head>
<body>
    <a href="logoutServlet">ログアウト</a>
    <br>
    <form action="">
        地区
        <select id="addrid" name="addrid">
            <option>県内</option>
            <option>東北・北海道</option>
            <option>関東</option>
            <option>北陸・甲信越</option>
            <option>東海</option>
            <option>近畿</option>
            <option>四国・中国</option>
            <option>九州・沖縄</option>
            <option>外国</option>
        </select>
        業種
        <select id="industryid" name="industryuid">
            <option>開発・情報</option>
            <option>製造</option>
            <option>卸売・小売</option>
            <option>建設</option>
            <option>金融・保険</option>
        </select>
        上場
        <select id="listedid" name="listedid">
            <option>上場</option>
            <option>東証一部</option>
            <option>東証二部</option>
            <option>非上場</option>
        </select>
        年別
        <select>
            <option>令和3年度</option>
            <option>令和4年度</option>
        </select><br><br>
        <input type="submit" value="検索">
    </form>
    <form action="">
       <button>企業情報登録</button>
    </form>
    <p>一覧表示</p>
    <table border="1">
       <tr>
        <th>ID</th>
        <th>企業名</th>
        <th>事業内容</th>
        <th>詳細</th>
        <th>修正</th>
        <th>削除</th>
       <tr>
       <tr>
         <td></td>
         <td></td>
         <td></td>
         <td></td>
         <td></td>
         <td></td>
       </tr>
    </table>
</body>
</html>