/*!
* Start Bootstrap - Shop Item v5.0.6 (https://startbootstrap.com/template/shop-item)
* Copyright 2013-2023 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-shop-item/blob/master/LICENSE)
*/
// This file is intentionally blank
// Use this file to add JavaScript to your project

document.addEventListener("DOMContentLoaded", () => {
  fetch('/T20250620/productList.do')
    .then(response => response.json())
    .then(products => {
      const container = document.querySelector(".row-cols-2");
      container.innerHTML = "";
      products.forEach(product => {
        const card = document.createElement("div");
        card.className = "col mb-5";
        card.innerHTML = `
          <div class="card h-100">
            <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
            <img class="card-img-top" src="../images/${product.prod_image}" alt="${product.prd_name}" />
            <div class="card-body p-4">
              <div class="text-center">
                <h5 class="fw-bolder">${product.prd_name}</h5>
                <div class="d-flex justify-content-center small text-warning mb-2">
                  ${"★".repeat(product.star_point)}${"☆".repeat(5 - product.star_point)}
                </div>
                <span class="text-muted text-decoration-line-through">${product.origin_price.toLocaleString()}원</span>
                ${product.sale_price.toLocaleString()}원
              </div>
            </div>
            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
              <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>
            </div>
          </div>
        `;
        container.appendChild(card);
      });
    })
    .catch(err => {
      console.error("상품 목록 로딩 실패", err);
    });
});
