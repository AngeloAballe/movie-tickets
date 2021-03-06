<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<spring:url value="/cinema/${cinema.id}/update" var="updateCinemaUrl"/>
<form:form action="${updateCinemaUrl}" method="post" modelAttribute="cinema">
    <div class="box box-primary">
        <div class="box-header with-border">
            <h3 class="box-title">Edit Cinema ${cinema.id}</h3>
        </div>
        <!-- /.box-header -->
        <!-- form start -->
        <div class="box-body">
            <div class="form-group">
                <label for="name">Cinema Name</label>
                <form:input path="name" cssClass="form-control"/>
                <form:errors path="name" />
            </div>
            <div class="form-group">
                <label for="">Seats</label>
                <div class="col-xs-12 text-center">
                    <c:forEach var="seat" items="${cinema.seats}" varStatus="loopX">
                        <c:forEach var="seat0" items="${seat}" varStatus="loopY">
                            <form:checkbox path="seats[${loopX.index}][${loopY.index}]" /> &nbsp;
                            <form:errors path="seats[${loopX.index}][${loopY.index}]" />
                        </c:forEach>
                        <br>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!-- /.box-body -->
        <div class="box-footer text-right">
            <button type="submit" class="btn btn-info">Save</button>
        </div>
    </div>
</form:form>
