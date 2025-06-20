package co.yedam.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.web.MainControl;
import co.yedam.web.ProductControl;
import co.yedam.web.ProductListControl;

public class FrontController extends HttpServlet {

	Map<String, Control> map;

	public FrontController() {
		map = new HashMap<>();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		map.put("/main.do", new MainControl());
		// 상품목록.
		map.put("/productList.do", new ProductListControl());
		// 상품상세.
		map.put("/productInfo.do", new ProductControl());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청정보에서 URI값을 읽어옴.
		String uri = req.getRequestURI();
		String context = req.getContextPath();
		String path = uri.substring(context.length());

		Control sub = map.get(path);
		if(sub != null) {
			sub.exec(req, resp);
		} else {
			System.err.println("잘못된 경로입니다: " + path);
			// 혹은 에러 페이지로 리다이렉트
		}
	}
}