<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>5강평가(2025.06.20)</title>
  <style>
    .message {
      color: blue;
    }

    .hint {
      color: red;
    }
  </style>
</head>

<body>
  <h3 class="message">${message }</h3>
  <h3 class="hint">hint: ${hint }</h3>

  <p>상품목록과 상품상세화면의 템플릿은 html폴더를 확인하세요</p>
  <p>상품목록템플릿으로 <a href="html/productList.html">이동</a>합니다.</p>
  <p>상품목록으로 <a href="productList.do">이동</a>합니다.</p>

  <script>
    setInterval(function () {
      location.href = "main.do";
    }, 5000);
  </script>
</body>

</html>