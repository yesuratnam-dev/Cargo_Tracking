<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search_Cargo</title>

<link rel="stylesheet" type="text/css" href="searchCSS.css" />
<script defer src="SearchJS.js"></script>

</head>




<style>
body {
  background-image: url('CargoTrackingSearch.jpg');
  background-repeat: no-repeat;
  
  background-attachment: fixed;
  background-size: cover;
}
</style>
<style> 
 #error {
  /* padding: 5px; */
  text-align: center;
  position:absolute;
    height: 50 px;
    width: 50 px;
    
    left:40%;
    top:20%;
   /*  margin-top:- 50/2 px;
    margin-left:- 50/2 px; */
  
  
  /* background-color:cyan; */
 /*  border: solid 1px black; */
}
</style>
<body>
<!-- <div class="header">
    <div class="search_bar">
        <input type="text" name="search" value="search">
</div>
</div> -->
<!-- 
<div class=navbar> -->


<form id="form" action="ProductDetails" method="post">
<div id="error">
<!-- 
<tr><td><h1><font color=blue>Consignment_TrackingNo:</font></h1></td> -->


<!-- 
<label for="Contrackingno">ConTrackingNo:</label> -->

<input type="text" name="Contrackingno" id="ContrackingId" required maxlength="8" placeholder="Enter_ConsignmentNo" style="height:25px; width:200px;">

<input type="submit" value="Go" style="height:30px; width:45px;">

<!-- 
<i class="fa fa-fw fa-search"></i> Search -->



</div>

</form>
<!-- </div> -->
</body>

</html>



<!--  <style>
body {font-family: Arial, Helvetica, sans-serif;}

.navbar {
  width: 40%;
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

<div class="navbar">
  <a class="active" href="http://localhost:8989/Cargo_Tracking/ConsignmentReg.jsp"><i class="fa fa-fw fa-home"></i> Register</a> 
  <a href="http://localhost:8989/Cargo_Tracking/SearchProduct.jsp"><i class="fa fa-fw fa-search"></i> Search</a> 
  <a href="http://localhost:8989/Cargo_Tracking/CurrentLoc.jsp"><i class="fa fa-fw fa-envelope"></i> CurrentLoc</a> 
  <a href="http://localhost:8989/Cargo_Tracking/ListOfProduct.jsp"><i class="fa fa-fw fa-user"></i> ListOfProducts</a>
</div>
-->