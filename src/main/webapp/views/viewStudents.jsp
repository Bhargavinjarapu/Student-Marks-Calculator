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
           display: block;
      padding: 10px;
      margin: 10px;
      text-align: center;
      text-decoration: none;
      color: #fff;
      background-color: #007bff;
      border-radius: 5px;
      transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #0056b3;
            
        }
    </style>
</head>
<body>

<h1 style="text-align: center;">Display All Student Details</h1>
<hr>
<center>
<table border="1">

	<tr>
		<td>Student ID</td>
		<td>Name</td>
		<td>Hibernate</td>
		<td>Spring</td>
		<td>SpringBoot</td>
		<td>Total</td>
		<td>Percentage</td>
		<td>Grade</td>
		<td>Result</td>
		<td>Edit</td>
		<td>Delete</td>
	</tr>
	<c:forEach var="student" items="${students}">
	<tr>
		<td>${student.sId}</td>
		<td>${student.sName}</td>
		<td>${student.hibernate}</td>
		<td>${student.spring}</td>
		<td>${student.springBoot}</td>
		<td>${student.total}</td>
		<td>${student.percentage}</td>
		<td>${student.grade}</td>
		<td>${student.result}</td>
		<td><a href="/update/${student.sId}">Edit</a></td>
		<td><a href="/delete/${student.sId}">Delete</a></td>
	</tr>
	</c:forEach>

</table>
</center>
</body>