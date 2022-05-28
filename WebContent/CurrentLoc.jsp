<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update_Location</title>

</head>
<style>
body {
  background-image: url('CargoTracking2.jpg');
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
    bordercolor:transparent;
    
    left:40%;
    top:20%;
   /*  margin-top:- 50/2 px;
    margin-left:- 50/2 px; */
  
  
  /* background-color:cyan; */
 /*  border: solid 1px black; */
}
#CTNO {

/* working */
 /* background-color: transparent!important; */
    /* border-color: transparent!important; */
    /* outline: transparent!important; */
    
    background-color: white ;
    opacity:0.7;
    border-color:black;
    outline:black;
  
}

#CL{
 background-color:white!important;
    /* border-color: transparent!important; */
    /* outline: transparent!important; */
    
   
    opacity:0.7;
   border-color:black;
    outline: black;
}

#S {
 background-color:  #4CAF50!important;
    /* border-color: transparent!important; */
    /* outline: transparent!important; */
    
    border-color:black;
    outline: black;
  
}
</style>
<body>


<form action="CurrentLocServlet" method="post">
<div id="error">
<table><!-- 
<tr><td><h1><font color=blue>Consignment_TrackingNo:</font></h1></td> -->

<tr>
<td><font color=blue><input id="CTNO" type="text" name="Contrackingno" required placeholder="Enter_ConTrackingNo" style="height:25px; width:250px;"></font></td>

</tr>

<!-- 
<tr><td><h1><font color=blue>Currentlocation:</font></h1></td> -->
<tr>
<td><font color=blue><input id="CL" type="text" name="Currentloc" required placeholder="Current_Location" style="height:25px; width:250px;"></font></td>

</tr>
<tr>
<td>
<input id="S" type="submit" value="Update" style="height:30px; width:120px;"></td>
</tr>


</table>
</div>
</form>


</body>
</html>