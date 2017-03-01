<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit member</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Member</h1>
        <form:form action="saveMember" method="post" modelAttribute="member">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>id:</td>
                <td><form:input path="id" /></td>
            </tr>

            <tr>
                <td>FirstName:</td>
                <td><form:input path="first_name" /></td>
            </tr>
            <tr>
            <tr>
                <td>LastName:</td>
                <td><form:input path="last_name" /></td>
                        </tr>
                        <tr>
                <td>Email</td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td><form:input path="gender" /></td>
            </tr>
            <tr>
                <td>Telephone:</td>
                <td><form:input path="tele_phone" /></td>
            </tr>

            <tr>
                <td>Userid:</td>
                <td><form:input path="userid" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>