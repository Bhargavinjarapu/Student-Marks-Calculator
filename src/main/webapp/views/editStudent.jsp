<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<head>
	<style>
        body {
        	background-color:#f0f0f0
            font-family: Arial, sans-serif;
            text-align: center;
        }

        h1 {
            color: #333;
        }

        table {
        	text-align:center;
            width: 50%;
            margin: 20px 0;
            border-collapse: collapse;
        }

        td {
            padding: 8px;
            border: 1px solid #ccc;
        }

        input[type="text"] {
            width: 25%;
            padding: 8px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        a {
            margin-top: 10px;
            text-decoration: none;
            background-color: #007BFF;
            color: white;
            padding: 10px 15px;
            border-radius: 5px;
        }

        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<h1>Edit User Data</h1>
<hr>
<a href="/viewStudent">View Students</a>
&nbsp
<a href="/addStudent">Add Student</a>
<form:form method="post" action="/edit_stu">
<center>
<table>
	<tr>
		<td></td>
		<td><form:hidden path="sId"/></td>
	</tr>
	<tr>
		<td>Name:</td>
		<td><form:input path="sName"/></td>
	</tr>
	<tr>
		<td>Hibernate:</td>
		<td><form:input path="hibernate"/></td>
	</tr>
	<tr>
		<td>Spring:</td>
		<td><form:input path="spring"/></td>
	</tr>
	<tr>
		<td>SpringBoot:</td>
		<td><form:input path="springBoot"/></td>
	</tr>
	<tr>
		<td colspan="2"><center><input type="submit" value="EditSave"/></center></td>
	</tr>
</table>
</center>
</form:form>
