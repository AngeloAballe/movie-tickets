<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/_taglibs.jspf" %>
<h1>hello</h1>

<form:form action="/movieSchedule/create" method="post" modelAttribute="movieSchedule">
    <div class="form-group">
        <label for="cinema">Cinema</label>
        <form:select path="cinema" items="${cinemas}" itemLabel="name" cssClass="form-control"/>
    </div>

    <div class="form-group">
        <label for="movies">Movie</label>
        <form:select path="movie" items="${movies}" itemLabel="title" cssClass="form-control"/>
    </div>

    <div class="form-group">
        <label for="date">Date</label>
        <form:input type="date" path="date" cssClass="form-control"/>
    </div>

    <div class="form-group">
        <label for="time">Time</label>
        <form:input type="time" path="start" cssClass="form-control"/>
    </div>

    <input type="submit" value="Submit">
</form:form>