<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<section class="py-5">
    <div class="container px-4 px-lg-5 my-5">
        <div class="row gx-4 gx-lg-5 align-items-center">
            <div class="col-md-6"><img class="card-img-top mb-5 mb-md-0" src="${pageContext.request.contextPath}/images/${product.prodImage}" alt="${product.prdName}" /></div>
            <div class="col-md-6">
                <div class="small mb-1">${product.prdCode}</div>
                <h1 class="display-5 fw-bolder">${product.prdName}</h1>
                <div class="fs-5 mb-5">
                	<c:if test="${product.originPrice > product.salePrice}">
                    	<span class="text-decoration-line-through"><fmt:formatNumber value="${product.originPrice}" pattern="#,###" />원</span>
                    </c:if>
                    <span><fmt:formatNumber value="${product.salePrice}" pattern="#,###" />원</span>
                </div>
                <p class="lead">${product.prdDesc}</p>
                <div class="d-flex">
                    <input class="form-control text-center me-3" id="inputQuantity" type="num" value="1" style="max-width: 3rem" />
                    <button class="btn btn-outline-dark flex-shrink-0" type="button">
                        <i class="bi-cart-fill me-1"></i>
                        Add to cart
                    </button>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="py-5 bg-light">
    <div class="container px-4 px-lg-5 mt-5">
        <h2 class="fw-bolder mb-4">추천 상품</h2>
        <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">

            <c:forEach var="rProd" items="${relatedProducts}">
            	<div class="col mb-5">
                <div class="card h-100">
                    <a href="${pageContext.request.contextPath}/productInfo.do?pcode=${rProd.prdCode}"><img class="card-img-top" src="${pageContext.request.contextPath}/images/${rProd.prodImage}" alt="..." /></a>
                    <div class="card-body p-4">
                        <div class="text-center">
                            <h5 class="fw-bolder">${rProd.prdName}</h5>
                            <div class="d-flex justify-content-center small text-warning mb-2">
                                <c:forEach begin="1" end="${rProd.starPoint}">
                                    <div class="bi-star-fill"></div>
                                </c:forEach>
                            </div>
                            <c:if test="${rProd.originPrice > rProd.salePrice}">
                           		<span class="text-muted text-decoration-line-through"><fmt:formatNumber value="${rProd.originPrice}" pattern="#,###" />원</span>
                           	</c:if>
                            <fmt:formatNumber value="${rProd.salePrice}" pattern="#,###" />원
                        </div>
                    </div>
                </div>
            </div>
            </c:forEach>
            
        </div>
    </div>
</section>