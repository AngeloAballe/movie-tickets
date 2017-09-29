<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<div class="row">
    <div class="col-xs-12">
        <div class="box">
            <div class="box-header">
                <h3 class="box-title">Movies</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
                <table class="table table-hover">
                    <tbody><tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Summary</th>
                        <th>Action</th>
                    </tr>

                    <c:forEach var="movie" items="${movies}">
                        <tr>
                            <td>M${movie.id}</td>
                            <td>${movie.title}</td>
                            <td>${movie.summary}</td>
                            <td>
                                <a href="/movie/${movie.id}" class="label label-primary">View</a>
                                <a href="/movie/${movie.id}/edit" class="label label-info">Edit</a>
                                <a href="/movie/${movie.id}/delete" class="label label-danger">Delete</a>
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

