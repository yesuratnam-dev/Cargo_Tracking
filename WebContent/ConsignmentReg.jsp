<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form action="Consignment_Servlet">
<table>
<tr><td><h1><font color=blue>Consignment_No:</font></h1></td>

<td><font color=blue><input type="text" name="Consignmentno"></font></td>

</tr>
<tr><td><h1><font color=blue>Consignment_TrackingNo:</font></h1></td>

<td><font color=blue><input type="text" name="Contrackingno"></font></td>

</tr>
<tr><td><h1><font color=blue>CargoVendername:</font></h1></td>

<td><font color=blue><input type="text" name="Cvname"></font></td>

</tr>
<tr><td><h1><font color=blue>BookingDate:</font></h1></td>
<!-- 
<td><font color=blue><input type="text" name="Bookingdate"></font></td> -->

<td><font color=blue><input type="date" name="BookingDate"></font></td>

</tr>

<tr><td><h1><font color=blue>Fromloc:</font></h1></td>

<td><font color=blue><input type="text" name="Fromloc"></font></td>

</tr>

<!-- <tr><td><h1><font color=blue>Currentloc:</font></h1></td>

<td><font color=blue><input type="text" name="Currentloc"></font></td>

</tr> -->
<tr><td><h1><font color=blue>Destloc:</font></h1></td>

<td><font color=blue><input type="text" name="Destloc"></font></td>

</tr>

<tr>
<td><h1><font color=blue><input type="submit" name="submit" value="Submit"></font></h1></td>

</tr>


</table>
</form>

</body>
</html>