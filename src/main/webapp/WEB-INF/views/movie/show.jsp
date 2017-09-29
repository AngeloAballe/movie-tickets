<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<div class="box box-primary">
    <div class="box-header with-border">
        <h3 class="box-title">${movie.title}</h3>
    </div>
    <!-- /.box-header -->
    <!-- form start -->
    <div class="box-body">
        <div class="form-group">
            <label for="title">Title</label>
            <input class="form-control" id="title" type="text" value="${movie.title}" disabled>
        </div>
        <div class="form-group">
            <label for="summary">Summary</label>
            <textarea class="form-control" name="summary" id="summary" cols="30" rows="10" disabled>${movie.summary}</textarea>
        </div>
        <div class="form-group">
            <label for="runningTimeMinutes">Running Time in Minutes</label>
            <input class="form-control" id="runningTimeMinutes" type="text" value="${movie.runningTimeMinutes}" disabled>
        </div>
    </div>
    <!-- /.box-body -->
    <div class="box-footer text-right">
        <a href="/movie/${movie.id}/edit" class="btn btn-info">Edit</a>
        <a href="/movie/${movie.id}/delete" class="btn btn-danger">Delete</a>
    </div>
</div>
