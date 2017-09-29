<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<div class="box box-primary">
    <div class="box-header with-border">
        <h3 class="box-title">Cinema ${cinema.id}</h3>
    </div>
    <!-- /.box-header -->
    <!-- form start -->
        <div class="box-body">
            <div class="form-group">
                <label for="name">Cinema Name</label>
                <input type="text" class="form-control" id="name" placeholder="Enter email" autocomplete="off" value="${cinema.name}" disabled>
            </div>
            <div class="form-group">
                <label for="">Seats</label>
                <div class="col-xs-12 text-center">
                    <c:forEach var="seat" items="${cinema.seats}">
                        <c:forEach var="seat0" items="${seat}">
                            <input type="checkbox" name="gender" value="test" disabled ${seat0 ? 'checked': ''}> &nbsp;
                        </c:forEach>
                        <br>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!-- /.box-body -->
        <div class="box-footer text-right">
            <a href="/cinema/${cinema.id}/edit" class="btn btn-info">Edit</a>
            <a href="/cinema/${cinema.id}/delete" class="btn btn-danger">Delete</a>
        </div>
</div>
