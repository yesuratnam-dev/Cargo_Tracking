<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main</title>
</head><style>
h1 {text-align: center;}

</style>

<style>
body {
  background-image: url('CargoTracking.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<body>
<!-- style="border:2px solid DodgerBlue;" -->
<form action="ConsignmentReg.jsp">


    <h1><input type="submit" value="order"></h1>


</form>


<form action="CurrentLoc.jsp">
<h1 ><input type="submit" value="DA"></h1>

</form>


<form action="SearchProduct.jsp">
<h1 ><input type="submit" value="Customer"></h1>

</form>

<form action="ListOfProduct.jsp">
<h1><input type="submit" value="List_Of_Orders"></h1>

</form>

</body>
</html>


 --%>
 
 
 
 
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<head><title>Cargo_Tracking_Main</title></head>

 <style>
body {
  background-image: url('CargoTracking.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
 
 <style>
body {font-family: Arial, Helvetica, sans-serif;}

.navbar {
  
  width: 35%;
  background-color: #555;
  overflow: auto;
}

.navbar a {
  float: left;
  padding: 12px;
  color: white;
  text-decoration: none;
  font-size: 17px;
}

.navbar a:hover {
  background-color: #000;
}

.active {
  background-color: #4CAF50;
}

@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
  }
}
</style>
<body>
<!-- 
<h2>Responsive Navigation Bar with Icons</h2>
<p>Try to resize the browser window to see the responsive effect.</p> -->

<div class="navbar">
  <a class="active" href="http://localhost:8989/Cargo_Tracking/ConsignmentReg.jsp"><!-- <i class="fa fa-fw fa-home"></i> --> Register</a> 
  <a href="http://localhost:8080/Cargo_Tracking/SearchProduct.jsp"><i class="fa fa-fw fa-search"></i> Search</a> 
  <a href="http://localhost:8080/Cargo_Tracking/CurrentLoc.jsp"><!-- <i class="fa fa-fw fa-envelope"></i> --> CurrentLoc</a> 
  <a href="http://localhost:8080/Cargo_Tracking/ListOfProduct.jsp"><!-- <i class="fa fa-fw fa-user"></i> --> ListOfProducts</a>
</div>

</body>
</html> 