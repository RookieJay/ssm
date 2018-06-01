<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style2.css" rel="stylesheet" type="text/css" />
<link href="css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="js/select-ui.min.js"></script>
<script type="text/javascript" src="editor/kindeditor.js"></script>	
<script type="text/javascript">
    KE.show({
        id : 'content7',
        cssPath : './index.css'
    });
  </script>
  
<script type="text/javascript">
$(document).ready(function(e) {
    $(".select1").uedSelect({
		width : 345			  
	});
	$(".select2").uedSelect({
		width : 167  
	});
	$(".select3").uedSelect({
		width : 100
	});
});
</script>
<jsp:include page="header.jsp"></jsp:include>
</head>

<body>
	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">表单</a></li>
    </ul>
    </div>
    
    <form action="${bathpath}/car/psUpdate">
    <div class="formbody">
    <div class="formtitle"><span>修改文章</span></div>
    <ul class="forminfo">
    <li><label>文章编号</label><input name="psId" type="text" class="dfinput" value="${passageForm.psId }" readonly="readonly"/><i></i></li>
    <li><label>文章标题</label><input name="psTitle" type="text" class="dfinput" value="${passageForm.psTitle }"/><i>标题不能超过30个字符</i></li>
    <li><label>文章图片</label><input name="psImg" type="text" class="dfinput" value="${passageForm.psImg }" /></li>
    <li><label>文章类别</label>
    <input name="opName" type="radio" value="保养" checked="checked"/>保养&nbsp;&nbsp;&nbsp;&nbsp;
    <input name="opName" type="radio" value="维修" />维修
    <li><label>文章内容<b>*</b></label>
    <textarea id="content7" name="psContent" value="${passageForm.psContent}" style="width:700px;height:250px;visibility:hidden;">${passageForm.psContent}</textarea>
    </li>
    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认修改"/></li>
<%--     <li><label>文章内容</label><input name="psContent" value="${passageForm.psContent}" class="textinput" ></li>
    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认保存"/></li> --%>
    </ul>
    </div>
     <font color="red">
		<span id="message">${msg}</span>
	</font>
    </form>
</body>
</html>
