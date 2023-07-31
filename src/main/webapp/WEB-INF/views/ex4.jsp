<%--
  Created by IntelliJ IDEA.
  User: jamie
  Date: 2023-07-31
  Time: 오후 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>${message}</h1>

  <h1><c:out value="${message}"></c:out></h1>
</body>
</html>
