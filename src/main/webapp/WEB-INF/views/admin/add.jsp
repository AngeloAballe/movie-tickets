<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/_taglibs.jspf" %>
<%@ page isELIgnored="false" %>

<spring:url value="/admin/createCinema" var="createCinemaUrl"/>

<form:form action="${createCinemaUrl}" method="post" modelAttribute="cinema">
    <c:forEach var="seat" items="${cinema.seats}" varStatus="loopX">
        <c:forEach var="seat0" items="${seat}" varStatus="loopY">
            <form:checkbox path="seats[${loopX.index}][${loopY.index}]" />
        </c:forEach>
        <br>
    </c:forEach>

    <input type="submit" value="submit">
</form:form>