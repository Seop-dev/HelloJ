package co.yedam.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import co.yedam.common.Control;
import co.yedam.service.ProductService;
import co.yedam.service.ProductServiceImpl;
import co.yedam.vo.ProductVO;

public class ProductControl implements Control {

    @Override
    public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pid = req.getParameter("pid");

        ProductService service = new ProductServiceImpl();
        ProductVO vo = service.getProduct(pid);

        // JSON 응답
        resp.setContentType("application/json;charset=utf-8");
        Gson gson = new Gson();
        resp.getWriter().print(gson.toJson(vo));
    }
}
