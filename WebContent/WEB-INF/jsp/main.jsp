<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Car Display</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<jsp:include page="header.jsp"></jsp:include>
<!--slider-->
<script type="text/javascript" src="js/modernizr.custom.53451.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.gallery.js"></script>
<script type="text/javascript">
		$(function() {
		$('#dg-container').gallery({
		autoplay	:	true
	});
});
</script>

</head>
<body>
  <div class="wrap">
  <div class="header">
    <div class="logo">
      <h1><a href="${basepath}/car/main"><img src="images/logo.png" alt=""></a></h1>
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
    <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >免费模板</a></div>
    <div class="h_main">
      <ul class="nav">
        <li class="active"><a href="${basepath}/car/home">首页</a></li>
        <li><a href="${basepath}/car/toMaintain">保养</a></li>
        <li><a href="${basepath}/car/toRepair">维修</a></li>
        <li><a href="${basepath}/car/contact">联系</a></li>
      </ul>
      <div class="search">
        <form action="findPart?name=${basic.name}" method="get">
          <input type="text" name="name"  placeholder="在此输入您要查找的关键字" value="">
          <input type="submit" value="">
        </form>
      </div>
      <div class="clear"></div>
    </div>
  </div>
  <div class="container">
    <section id="dg-container" class="dg-container">
      <div class="dg-wrapper"> <a href="#"><img src="images/1.jpg" alt="image1" /></a> <a href="#"><img src="images/2.jpg" alt="image2" /></a> <a href="#"><img src="images/3.jpg" alt="image3" /></a> <a href="#"><img src="images/4.jpg" alt="image4" /></a> <a href="#"><img src="images/5.jpg" alt="image5" /></a> <a href="#"><img src="images/6.jpg" alt="image1" /></a> <a href="#"><img src="images/7.jpg" alt="image2" /></a> <a href="#"><img src="images/8.jpg" alt="image3" /></a> </div>
    </section>
  </div>
  <div class="main">
  
    <div class="section group">
    <font color="red"><span style="font-size: 30px;">${msg}</span></font>
    <c:forEach items="${basics}" var="b">
      <div class="grid_1_of_4 images_1_of_4"> <a href="toDetails?id=${b.id}"><img src="${b.appearance}"></a> <a href="details.html">
        <h3 style="text-align: center;">${b.name}</h3>
        </a> </div>  </c:forEach>
      <div class="clear"></div>
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
        <p class="w3-link">© All Rights Reserved <a href="http://www.cssmoban.com/" target="_blank" title="Jay">Jay</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a> </p>
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