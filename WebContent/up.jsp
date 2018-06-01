<%@ include file="/WEB-INF/jsp/header.jsp" %>  
    <%@ page language="java" contentType="text/html; charset=UTF-8"  
        pageEncoding="UTF-8"%>  
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    <jsp:include page="header.jsp"></jsp:include>
    <html>  
    <head>  
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
    <meta http-equiv="pragma" content="no-cache" />  
    <base target="_self">  
    <title>文件上传</title>  
    </head>  
    <body>  
         <p align="center">文件上传</p>  
    <form id="form1" name="form1" method="post" action="${basePath}/file/upload" enctype="multipart/form-data">  
        <table border="0" align="center">  
            <tr>  
                <td>上传文件：</td>  
                <td><input name="file" type="file" size="20"></td>  
            </tr>  
            <tr>  
                <td></td>  
                <td><input type="submit" value="提交"> <input type="reset" name="reset" value="重置"></td>  
            </tr>  
        </table>  
    </form>  
    </body>  
    </html>