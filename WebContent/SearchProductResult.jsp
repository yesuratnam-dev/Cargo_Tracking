<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<p style="color:red">Search</p>

<c:forEach var="data" items="${Search}">

${data.ConsignmentNo}
</c:forEach>


