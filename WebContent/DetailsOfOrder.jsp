<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cargo_Search</title>
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
    
    left:35%;
    top:20%;
   /*  margin-top:- 50/2 px;
    margin-left:- 50/2 px; */
  
  
  /* background-color:cyan; */
 /*  border: solid 1px black; */
}
</style>

<body>
<form action="CompleteDetailsOfOrder" method="post">
<div id="error">
<table><!-- 
<tr><td><h1><font color=blue>Consignment_TrackingNo:</font></h1></td> -->
<tr>
<td><font color=blue><input type="text" name="Contrackingno" placeholder="Enter_TrackingNo" Required maxlength="8" style="height:25px; width:200px;"></font></td>




<td><font color=blue><input type="submit" value="Go" style="height:30px; width:45px;"></font></td>
</tr>

</table>
</div>
</form>
</body>
</html>