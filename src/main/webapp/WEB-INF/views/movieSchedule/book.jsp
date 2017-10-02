<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<spring:url value="/movieSchedule/${movieSchedule.id}/book" var="bookUrl"/>
<form:form id="testForm" action="${bookUrl}" method="post" modelAttribute="movieSchedule">
    <div class="box box-primary">
        <div class="box-header with-border">
            <h3 class="box-title">Book</h3>
        </div>
        <!-- /.box-header -->
        <!-- form start -->
        <div class="box-body">
            <div class="form-group">
                <label for="">Book Seats</label>
                <div class="col-xs-12 text-center">
                    <c:forEach var="row" items="${movieSchedule.seats}" varStatus="loopX">
                        <c:forEach var="seat" items="${row}" varStatus="loopY">
                            <c:choose>
                                <c:when test="${movieSchedule.seats[loopX.index][loopY.index].enabled}">
                                    <form:checkbox path="seats[${loopX.index}][${loopY.index}].reserved"/> &nbsp;
                                    <form:errors path="seats[${loopX.index}][${loopY.index}].reserved" />
                                </c:when>
                                <c:otherwise>
                                    X &nbsp;
                                </c:otherwise>
                            </c:choose>
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
