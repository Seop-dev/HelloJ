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

public class ProductControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pcode = req.getParameter("pcode");
		
		ProductService svc = new ProductServiceImpl();
		ProductVO vo = svc.getProduct(pcode);
		List<ProductVO> relatedList = svc.listRecommendedProducts();

		req.setAttribute("product", vo);
		req.setAttribute("relatedProducts", relatedList);

		// Tiles를 사용하기 위해 정의된 이름으로 포워딩
		req.getRequestDispatcher("product/productInfo.tiles").forward(req, resp);
	}
}