<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<div class="row">
    <div class="col-md-6">
        <h1>Cinemas</h1>
        <a href="/cinema/create" class="btn btn-success">Add Cinemas</a>
        <c:forEach var="cinema" items="${cinemas}">
            <h3>Cinema - ${cinema.id}</h3>
            <c:forEach var="seat" items="${cinema.seats}">
                <c:forEach var="seat0" items="${seat}">
                    <input type="checkbox" name="gender" value="test" disabled ${seat0 ? 'checked': ''}> &nbsp;
                </c:forEach>
                <br>
            </c:forEach>

            <a href="/cinema/${cinema.id}/edit" class="btn btn-default">Edit</a>
            <a href="/cinema/${cinema.id}/delete" class="btn btn-danger">Delete</a>
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