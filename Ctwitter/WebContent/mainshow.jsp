<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
</head>
<body>
<c:if test="${sessionScope.upet}==null">
<c:redirect url="Login.jsp"></c:redirect>
</c:if>
<h2> 欢迎${sessionScope.upet}</h2>
</body>
</html>