package co.yedam.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.ProductService;
import co.yedam.service.ProductServiceImpl;
import co.yedam.vo.ProductVO;

public class ProductListControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductService svc = new ProductServiceImpl();
		List<ProductVO> list = svc.listProducts();

		req.setAttribute("productList", list);
		
		// Tiles를 사용하기 위해 정의된 이름으로 포워딩
		req.getRequestDispatcher("product/productList.tiles").forward(req, resp);
	}
}