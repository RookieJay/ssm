<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Flashy Login Form Responsive Widget Template :: w3layouts</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Flashy Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Meta tag Keywords -->
<!-- css files -->
<link rel="stylesheet" href="css/style1.css" type="text/css" media="all" /> <!-- Style-CSS --> 
<link rel="stylesheet" href="css/font-awesome.css"> <!-- Font-Awesome-Icons-CSS -->
<style type="text/css">
input[type="text"]{
    outline: none;
    font-size: .9em;
    padding: 1em 5em 1em 1em;
    border: none;
    margin-bottom: .8em;
    background: #fff;
    width: 78%;
    color: #000;
    font-family: 'Roboto', sans-serif;
}

</style>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
	<!-- main -->
	<div data-vide-bg="video/animation">
		<div class="center-container">
			<!--header-->
			<div class="header-w3l">
				<h1>Car display</h1>
			</div>
			<!--//header-->
			<div class="main-content-agile">
				<div class="left-w3l-mk">
					<img src="images/lanbo.jpg" alt="民国 ">
					<h3>User</h3>
					<div class="social-icon">
							<a href="#" class="social-button twitter"><i class="fa fa-twitter"></i></a>
							<a href="#" class="social-button facebook"><i class="fa fa-facebook"></i></a> 
							<a href="#" class="social-button google"><i class="fa fa-google-plus"></i></a> 
							<a href="#" class="social-button dribbble"><i class="fa fa-dribbble"></i></a>
						</div>
				</div>
				<div class="sub-main-w3">	
					<div class="wthree-pro">
					<img alt="login" src="images/register.png">
						<h2><span>User</span> Register</h2>
					</div>
					<form action="${basePath}/addUser" method="post">
						<input placeholder="请输入用户名" name="userName" class="user" type="text" /><br/>
						<input  placeholder="请输入密码" name="userPwd" class="pass" type="text" /><br/>
						<select name="sex">
							<option value="男" selected="selected">男</option>
							<option value="女">女</option>
						</select><br/>
						<input  placeholder="请输入邮箱" name="email" class="pass" type="text" /><br/>
						<input  placeholder="请输入电话" name="tel" class="pass" type="text" /><br/>
						<font color="red">
							<span id="message">${msg}</span>
						</font>	
						<input type="submit" value="Register">
					</form>
				</div>
				<div class="clear"></div>
			</div>
			<!--//main-->

			<!--footer-->
			<div class="footer">
				<p>&copy; 2017 Flashy Login Form. All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
			</div>
			<!--//footer-->
		</div>
	</div>
	
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<!-- //js -->
<script src="js/jquery.vide.min.js"></script>
<span id="msg">3</span>
</body>
</html>