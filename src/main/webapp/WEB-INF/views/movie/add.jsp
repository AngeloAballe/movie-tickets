<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<spring:url value="/movie/create" var="createMovieUrl"/>
<form:form action="${createMovieUrl}" method="post" modelAttribute="movie">
    <div class="box box-primary">
        <div class="box-header with-border">
            <h3 class="box-title">Add Movie</h3>
        </div>
        <!-- /.box-header -->
        <!-- form start -->
        <div class="box-body">
            <div class="form-group">
                <label for="title">Title</label>
                <form:input path="title" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label for="summary">Summary</label>
                <form:textarea path="summary" cssClass="form-control"/>
            </div>

            <div class="form-group">
                <label for="runningTimeMinutes">Running Time in Minutes</label>
                <form:input path="runningTimeMinutes" cssClass="form-control"/>
            </div>
        </div>
        <!-- /.box-body -->
        <div class="box-footer text-right">
            <button type="submit" class="btn btn-info">Save</button>
        </div>
    </div>
</form:form>
