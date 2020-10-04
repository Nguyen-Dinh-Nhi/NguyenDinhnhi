<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body>
<p>Your reservation is confirmed successfully. Please, re-check the details.</p>
First Name : ${reservation.firstName}
<br>
Last Name : ${reservation.lastName}
<br>
Gender: ${reservation.gender}<br>
Meals:
<ul>
<c:forEach var="meal" items="${reservation.food}">
<li>${meal}</li>
</c:forEach>
</ul>
Leaving From : ${reservation.cityFrom}
<br>
Going To : ${reservation.cityTo}
</body>