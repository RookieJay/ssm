<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>网站后台管理系统HTML模板--模板之家 www.cssmoban.com</title>
<link href="css/style2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">
$(document).ready(function(){
  $(".click").click(function(){
  $(".tip").fadeIn(200);
  });
  
  $(".tiptop a").click(function(){
  $(".tip").fadeOut(200);
});

  $(".sure").click(function(){
  $(".tip").fadeOut(100);
});

  $(".cancel").click(function(){
  $(".tip").fadeOut(100);
});

});

/* function test(){
	var roleId = $("#roleId").val();
	$.ajax({
		url:"${pageContext.request.contextPath}/listUser",
		type:"post",
		data:JSON.stringify({roleId:roleId}),
		contentType:"application/json;charset=UTF-8",
		dataType:"json",
		success:function(data){
			if(data.roleId==1011){
				alert("您的角色是管理员");
			}
			if(data.roleId==1012){
				alert("您的角色是用户");
			}
	
		}
	})
} */
</script>

<jsp:include page="header.jsp"></jsp:include>
</head>

<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">数据表</a></li>
    <li><a href="#">基本内容</a></li>
    </ul>
    </div>
    
    <div class="rightinfo">
    
    <div class="tools">
    
    	<ul class="toolbar">
       <li class="click"><a href="toAdminAdd"><span><img src="images/t01.png" /></span>添加</a></li>
        <li class="click"><span><img src="images/t02.png" /></span>修改</li>
        <li><span><img src="images/t03.png" /></span>删除</li>
        <li><span><img src="images/t04.png" /></span>统计</li>
        </ul>
        <ul class="toolbar1">
        <li><span><img src="images/t05.png" /></span>设置</li>
        </ul>
    </div>
    <form action="deleteUsers" method="post">
    <table class="tablelist">
    	<thead>
    	<tr>
        <th></th>
        <th>编号<i class="sort"><img src="images/px.gif" /></i></th>
        <th>角色</th>
        <th>邮箱</th>
        <th>用户</th>
        <th>性别</th>
        <th>电话</th>
        <th>密码</th>
        <th>操作</th>
        </tr>
        </thead>
        
        <tbody>
        <c:forEach items="${userForms}" var="u" varStatus = "currentStatus">
        <tr>
        <td><input name="ids" type="checkbox" value="${u.userId}" /></td>
        <td>${u.userId}</td>
        <td><a href="queryRole?roleId=${u.role}">${u.role}</a></td>
        <td>${u.email}</td>
        <td>${u.userName}</td>
        <td>${u.sex}</td>
        <td>${u.tel}</td>
        <td>${u.userPwd}</td>
        <td><a href="toAdminUpdate?userId=${u.userId}" class="tablelink">修改</a>     
        <a onClick="return confirm('确认要删除${u.userName}？')"href="deleteUser?userId=${u.userId}" class="tablelink"> 删除</a></td>
        </tr> 
        </c:forEach>
        </tbody>
        
    </table>
   
   <input type="submit" value="批量删除" onClick="return confirm('确认要批量删除？')" />
    <font color="red">
		<span id="message">${msg}</span>
	</font>
   </form>
    <div class="pagin">
    	<div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
        <ul class="paginList">
        <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
        <li class="paginItem"><a href="javascript:;">1</a></li>
        <li class="paginItem current"><a href="javascript:;">2</a></li>
        <li class="paginItem"><a href="javascript:;">3</a></li>
        <li class="paginItem"><a href="javascript:;">4</a></li>
        <li class="paginItem"><a href="javascript:;">5</a></li>
        <li class="paginItem more"><a href="javascript:;">...</a></li>
        <li class="paginItem"><a href="javascript:;">10</a></li>
        <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
        </ul>
    </div>
    
    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	
    
	</script>
</body>
</html>
