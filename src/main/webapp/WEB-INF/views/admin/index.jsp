<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<div class="row">
    <div class="col-md-6">
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
    </div>
    <div class="col-md-6">
        <h1>Movies</h1>
        <c:forEach var="movie" items="${movies}">
            <h3>${movie.title}</h3>
            <p>${movie.summary}</p>
        </c:forEach>
    </div>
</div>