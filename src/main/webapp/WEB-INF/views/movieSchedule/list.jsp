<%@ include file="/WEB-INF/views/_taglibs.jspf" %>
<%@ taglib uri="http://sargue.net/jsptags/time" prefix="javatime" %>

<div class="row">
    <div class="col-xs-12">
        <div class="box">
            <div class="box-header">
                <h3 class="box-title">Movie Schedules</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
                <table class="table table-hover">
                    <tbody><tr>
                        <th>Cinema</th>
                        <th>Movie</th>
                        <th>Schedule</th>
                        <th>Action</th>
                    </tr>

                    <c:forEach var="movieSchedule" items="${movieSchedules}">
                        <tr>
                            <td>${movieSchedule.cinema.name}</td>
                            <td>${movieSchedule.movie.title}</td>
                            <fmt:parseDate value="${movieSchedule.date}" pattern="yyyy-MM-dd" var="parsedDate" type="date" />
                            <fmt:formatDate value="${parsedDate}" var="newParsedDate" type="date" pattern="(E) MMMM dd, yyyy" />
                            <td>
                                    ${newParsedDate} <br>
                                    ${movieSchedule.start} - ${movieSchedule.end}
                            </td>
                            <td>
                                <a href="/movieSchedule/${movieSchedule.id}" class="label label-primary">View</a>
                                <a href="/movieSchedule/${movieSchedule.id}/edit" class="label label-info">Edit</a>
                                <a href="/movieSchedule/${movieSchedule.id}/delete" class="label label-danger">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                    <tr>
                    </tbody>
                </table>
            </div>
            <!-- /.box-body -->
        </div>
    </div>
</div>

