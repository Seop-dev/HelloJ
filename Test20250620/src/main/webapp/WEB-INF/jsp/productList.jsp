<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<header class="bg-dark py-5">
    <div class="container px-4 px-lg-5 my-5">
        <div class="text-center text-white">
            <h1 class="display-4 fw-bolder">Yedam Coffee Shop</h1>
            <p class="lead fw-normal text-white-50 mb-0">엄선된 최고의 원두를 만나보세요</p>
        </div>
    </div>
</header>
<section class="py-5">
    <div class="container px-4 px-lg-5 mt-5">
        <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">

            <c:forEach var="product" items="${productList}">
                <div class="col mb-5">
                    <div class="card h-100">
                        <c:if test="${product.originPrice > product.salePrice}">
                             <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
                        </c:if>
                        <a href="${pageContext.request.contextPath}/productInfo.do?pcode=${product.prdCode}"><img class="card-img-top" src="${pageContext.request.contextPath}/images/${product.prodImage}" alt="${product.prdName}" /></a>
                        <div class="card-body p-4">
                            <div class="text-center">
                                <h5 class="fw-bolder">${product.prdName}</h5>
                                <div class="d-flex justify-content-center small text-warning mb-2">
                                    <c:forEach begin="1" end="${product.starPoint}">
                                    	<div class="bi-star-fill"></div>
                                    </c:forEach>
                                </div>
                                <c:if test="${product.originPrice > product.salePrice}">
                               		<span class="text-muted text-decoration-line-through"><fmt:formatNumber value="${product.originPrice}" pattern="#,###" />원</span>
                                </c:if>
                                <fmt:formatNumber value="${product.salePrice}" pattern="#,###" />원
                            </div>
                        </div>
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>
                        </div>
                    </div>
                </div>
            </c:forEach>

        </div>
    </div>
</section>