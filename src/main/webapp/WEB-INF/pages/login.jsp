<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Login Form</title>

<style>
    #invalid_1{
	  color:red;
	  position:absolute;
	  top:50px;
	  left:825px;
	}
	#invalid_2{
	  color:red;
	  position:absolute;
	  top:105px;
	  left:825px;
	}
</style>
</head>
<body>
    <form:form name="submitForm" method="POST" onsubmit="return validate()">
        <div align="center">
            <table>
                <tr>
                    <td>User Name</td>
                    <td><input type="text" name="userName" placeholder="Enter user name"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" placeholder="It should be atleast 8 char" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
            <div style="color: red">${error}</div>
        </div>
    </form:form>
     <p id="invalid_1"></p>
     <p id="invalid_2"> </p>

      <script type= "text/javascript">



         function validate(){



     	  if(document.getElementById("name").value == ""){
     	   document.getElementById("invalid_1").innerHTML = "Name shouldn't be empty";
     	   invalid = 0;
     	  }
     	  else{
     	   document.getElementById("invalid_1").innerHTML = "";
     	  }

     	  if(document.getElementById("password").value == ""){
               	   document.getElementById("invalid_2").innerHTML = "Password shouldn't be empty";
               	   invalid = 0;
               	  }
               	  else{
               	   document.getElementById("invalid_2").innerHTML = "";
               	  }
   </script>
</body>
</html>