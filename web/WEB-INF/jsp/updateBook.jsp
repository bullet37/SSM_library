<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update book</title>

    <%--BootStrap--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>Update book</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="ID" value="${Qbook.getID()}">
        <div class="form-group">
            <label>Book Name:</label>
            <input type="text" name="Name" class="form-control" value="${Qbook.getName()}" required>
        </div>
        <div class="form-group">
            <label>Book Amount:</label>
            <input type="text" name="Amount" class="form-control" value="${Qbook.getAmount()}" required>
        </div>
        <div class="form-group">
            <label>Description:</label>
            <input type="text" name="Description" class="form-control" value="${Qbook.getDescription()}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="Modify">
        </div>
    </form>

</div>
</body>
</html>

