<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<div class="box box-primary">
    <div class="box-header with-border">
        <h3 class="box-title">Movie Schedule ${movieSchedule.id}</h3>
    </div>
    <!-- /.box-header -->
    <!-- form start -->
        <div class="box-body">
            <div class="form-group">
                <label for="name">Cinema</label>
                <input type="text" class="form-control" id="name" value="${movieSchedule.cinema.name}" disabled>
            </div>
            <div class="form-group">
                <label for="movie">Movie</label>
                <input type="text" class="form-control" id="movie" value="${movieSchedule.movie.title}" disabled>
            </div>
            <div class="form-group">
                <label for="date">Schedule</label>
                <input type="date" class="form-control" id="date" value="${movieSchedule.date}" disabled>
            </div>
            <div class="form-group">
                <label for="start">Start Time</label>
                <input type="time" class="form-control" id="start" value="${movieSchedule.start}" disabled>
            </div>
        </div>
        <!-- /.box-body -->
        <div class="box-footer text-right">
            <a href="/movieSchedule/${movieSchedule.id}/edit" class="btn btn-info">Edit</a>
            <a href="/movieSchedule/${movieSchedule.id}/delete" class="btn btn-danger">Delete</a>
        </div>
</div>
