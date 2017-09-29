<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<div class="row">
    <div class="col-xs-12">
        <div class="box">
            <div class="box-header">
                <h3 class="box-title">Cinemas</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
                <table class="table table-hover">
                    <tbody><tr>
                        <th>Cinema ID</th>
                        <th>Cinema Name</th>
                        <th>Action</th>
                    </tr>

                    <c:forEach var="cinema" items="${cinemas}">
                        <tr>
                            <td>C${cinema.id}</td>
                            <td>${cinema.name}</td>
                            <td>
                                <a href="/cinema/${cinema.id}" class="label label-primary">View</a>
                                <a href="/cinema/${cinema.id}/edit" class="label label-info">Edit</a>
                                <a href="/cinema/${cinema.id}/delete" class="label label-danger">Delete</a>
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

<script>
    jhhjk
</script>

