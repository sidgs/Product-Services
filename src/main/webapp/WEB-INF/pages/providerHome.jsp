<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Provider</title>
</head>
<body>
    <div align="center">
        <h1>Provider List</h1>
        <h3>
            <a href="newProvider">New provider</a>
        </h3>
        <table border="1">

            <th>id</th>
            <th>provider_name</th>
            <th>provider_id</th>

            <th>Action</th>


            <c:forEach var="provider" items="${listProvider}">
                <tr>

                    <td>${provider.id}</td>
                    <td>${provider.provider_name}</td>
                    <td>${provider.provider_id}</td>


                    <td> <a href="editProvider?id=${provider.id}">Edit</a>

                         <a href="deleteProvider?id=${provider.id}">Delete</a>
                    </td>

                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
