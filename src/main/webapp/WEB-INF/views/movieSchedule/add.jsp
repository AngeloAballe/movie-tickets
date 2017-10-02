<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<spring:url value="/movieSchedule/create" var="createMovieScheduleUrl"/>
<form:form action="${createMovieScheduleUrl}" method="post" modelAttribute="movieSchedule">
    <div class="box box-primary">
        <div class="box-header with-border">
            <h3 class="box-title">Add Movie Schedule</h3>
        </div>
        <!-- /.box-header -->
        <!-- form start -->
        <div class="box-body">
            <div class="form-group">
                <label for="cinema">Cinema</label>
                <form:select path="cinema" items="${cinemas}" itemLabel="name" cssClass="form-control"/>
                <form:errors path="cinema" />
            </div>

            <div class="form-group">
                <label for="movies">Movie</label>
                <form:select path="movie" items="${movies}" itemLabel="title" cssClass="form-control"/>
                <form:errors path="movie" />
            </div>

            <div class="form-group">
                <label for="date">Date</label>
                <form:input type="date" path="date" cssClass="form-control"/>
                <form:errors path="date" />
            </div>

            <div class="form-group">
                <label for="time">Time</label>
                <form:input type="time" path="start" cssClass="form-control"/>
                <form:errors path="start" />
            </div>
        </div>
        <!-- /.box-body -->
        <div class="box-footer text-right">
            <button type="submit" class="btn btn-info">Save</button>
        </div>
    </div>
</form:form>
