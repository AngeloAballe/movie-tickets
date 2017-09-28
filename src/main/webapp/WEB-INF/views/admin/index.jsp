<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<h1>Cinemas</h1>
<c:forEach var="cinema" items="${cinemas}">
    <h3>Cinema - ${cinema.id}</h3>
    <c:forEach var="seat" items="${cinema.seats}">
        <c:forEach var="seat0" items="${seat}">
            <input type="checkbox" name="gender" value="test" disabled ${seat0 ? 'checked': ''}> &nbsp;
        </c:forEach>
        <br>
    </c:forEach>
</c:forEach>