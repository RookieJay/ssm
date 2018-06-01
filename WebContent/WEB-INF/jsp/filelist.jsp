<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>已上传文章</title>
<link href="css/style2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<jsp:include page="header.jsp"></jsp:include>
</head>


<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="computer.html">文件管理</a></li>
    <li><a href="#">列表</a></li>
    </ul>
    </div>
    <table class="filetable">
    <thead>
    	<tr>
        <th width="25%">缩略图</th>
        <th width="11%">文章类别</th>
        <th width="10%">文章标题</th>
        <th width="42%">文章内容</th>
        <th width="12%">操作</th>
        </tr>    	
    </thead>
    <c:forEach items="${passageForms}" var="p" varStatus="currentStatus">
    <tbody>
    	<tr>
        <td><img src="${p.psImg}" style="width: 50%;height: 40%"/></td>
        <td>${p.opName}</td>
        <td>${p.psTitle}</td>
        <td class="tdlast">${p.psContent}</td>
        <td><a href="toUpdate?psId=${p.psId}">修改</a><a href="psDelete?psId=${p.psId}">删除</a></td>
        </tr>
    </tbody>
    </c:forEach>
    </table>
</body>
</html>
