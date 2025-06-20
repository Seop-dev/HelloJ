<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <title>Yedam Coffee Shop</title>
        <link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/assets/favicon.ico" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" />
    </head>
    <body>
        <tiles:insertAttribute name="header" />

        <tiles:insertAttribute name="body" />
        
        <tiles:insertAttribute name="footer" />
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/scripts.js"></script>
    </body>
</html>