<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<head>
  <title>Registration Form</title>
  <style>
    body {
      font-family: 'Arial', sans-serif;
      margin: 0;
      padding: 0;
      background-color: #f0f0f0;
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      height: 100vh;
    }

    h1 {
      color: #333;
      text-align: center;
    }

    form {
      display: flex;
      flex-direction: column;
      align-items: center;
    }

    label {
      margin: 10px 0;
    }

    input {
      padding: 10px;
      margin: 5px 0;
      border: 1px solid #ccc;
      border-radius: 5px;
      width: 300px;
      box-sizing: border-box;
    }

    input[type="submit"] {
      cursor: pointer;
      background-color: #007bff;
      color: #fff;
      transition: background-color 0.3s ease;
    }

    input[type="submit"]:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>

  <h1>Add New Student</h1>

  <form action="/register" method="post">
    <label for="id">ID:</label>
    <input type="text" id="id" name="sId" required>

    <label for="name">Name:</label>
    <input type="text" id="name" name="sName" required>

    <label for="hibernate">Hibernate:</label>
    <input type="text" id="hibernate" name="hibernate" required>

    <label for="spring">Spring:</label>
    <input type="text" id="spring" name="spring" required>

    <label for="springboot">Spring Boot:</label>
    <input type="text" id="springboot" name="springBoot" required>

    <input type="submit" value="Add">
  </form>

</body>
</html>
