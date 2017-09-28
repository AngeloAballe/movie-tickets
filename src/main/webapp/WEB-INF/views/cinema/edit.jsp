<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<h1>Edit Cinema</h1>

<spring:url value="/cinema/${cinema.id}/update" var="updateCinemaUrl"/>
<form:form action="${updateCinemaUrl}" method="post" modelAttribute="cinema">
    <c:forEach var="seat" items="${cinema.seats}" varStatus="loopX">
        <c:forEach var="seat0" items="${seat}" varStatus="loopY">
            <form:checkbox path="seats[${loopX.index}][${loopY.index}]" />
        </c:forEach>
        <br>
    </c:forEach>

    <input type="submit" value="submit">
</form:form>