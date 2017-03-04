<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
    <h2>Found Products</h2>

    <c:forEach var="product" items="${foundProducts}">
        <ul>
          <li>${product.getProduct_name()}</li>
          <li>${product.getDescription()}</li>
          <li>${product.getProduct_style()}</li>
        </ul>
        <hr>
    </c:forEach>

</body>
</html>