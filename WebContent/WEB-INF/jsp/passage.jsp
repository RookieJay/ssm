<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Passage </title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
<div class="wrap">
  <div class="header">
    <div class="logo">
      <h1><a href="${basepath}/car/home"><img src="images/logo.png" alt=""></a></h1>
    </div>
    <div class="h_right">
      <div class="drp-dwn">
        <ul>
          <li>
            <h3>Select ur Language :</h3>
          </li>
          <li>
            <select onChange="window.location=this.options[this.selectedIndex].value">
              <option value="">English</option>
              <option value="">German</option>
              <option value="">French</option>
            </select>
          </li>
          <li>
            <h3 style="margin-left: 10px;">Currency :</h3>
          </li>
          <li>
            <select onChange="window.location=this.options[this.selectedIndex].value">
              <option value="">US Dollar-USD</option>
              <option value="">Euro-EUR</option>
              <option value="">Indian Rupee-INR</option>
            </select>
          </li>
        </ul>
      </div>
      <div class="header_top_right">
        <div class="login"> 
        <span><a href="${basepath}/car/userInfo"><span class="person_info">个人信息</span> </a></span>   
        </div>
        <div class="shopping_cart">
          <div class="cart_img"> <img src="${sessionScope.user.avatar}"></div>
          <div class="cart">  <span class="cart_title">欢迎登录，${sessionScope.user.userName}!</span> <a href="${basePath}/logout">注销 </a> </div>
        </div>
        <div class="clear"></div>
      </div>
    </div>
    <div class="clear"></div>
    <div class="h_main">
      <ul class="nav">
        <li class="active"><a href="${basePath}/home">首页</a></li>
        <li><a href="${basePath}/toMaintain">保养</a></li>
        <li><a href="${basePath}/toRepair">维修</a></li>
        <li><a href="${basePath}/contact">联系</a></li>
      </ul>
      <div class="search">
        <form>
          <input type="text" value="">
          <input type="submit" value="">
        </form>
      </div>
      <div class="clear"></div>
    </div>
  </div>
  <div class="main">
    <div class="main1">
      <h2 class="hdr_s" style="text-align: center;">${passage.psTitle}</h2>
          <p style="text-indent: 20px;color: #969696">${passage.psContent}</p>
      </div>
   
    </div>
  </div>
  <div class="footer">
    <div class="f_left">
      <div class="f_nav">
        <ul>
          <li><a href="">about us</a></li>
          <li><a href="">site map</a></li>
          <li><a href="">customer Service</a></li>
          <li><a href="">search terms</a></li>
          <li><a href="">contact us</a></li>
        </ul>
      </div>
      <div class="copy">
        <p class="w3-link">Â© All Rights Reserved | More Templates <a href="http://www.cssmoban.com/" target="_blank" title="æ¨¡æ¿ä¹å®¶">æ¨¡æ¿ä¹å®¶</a> - Collect from <a href="http://www.cssmoban.com/" title="ç½é¡µæ¨¡æ¿" target="_blank">ç½é¡µæ¨¡æ¿</a> </p>
      </div>
    </div>
    <div class="social-icons">
      <ul>
        <li class="icon1"><a href="#" target="_blank"> </a></li>
        <li class="icon2"><a href="#" target="_blank"> </a></li>
        <li class="icon3"><a href="#" target="_blank"> </a></li>
        <li class="icon4"><a href="#" target="_blank"> </a></li>
        <div class="clear"></div>
      </ul>
    </div>
    <div class="clear"></div>
  </div>
</div>
</body>
</html>