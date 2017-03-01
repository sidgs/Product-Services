<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit provider</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Provider</h1>
        <form:form action="saveProvider" method="post" modelAttribute="provider">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>id:</td>
                <td><form:input path="id" /></td>
            </tr>

            <tr>
                <td>ProviderId:</td>
                <td><form:input path="provider_id" /></td>
            </tr>
            <tr>
            <tr>
                <td>ProviderName:</td>
                <td><form:input path="provider_name" /></td>
                        </tr>

            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>