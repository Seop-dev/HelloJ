package co.yedam.service;

import java.util.List;
import co.yedam.vo.ProductVO;

public interface ProductService {
    // 기존 메소드
    String cheeringMessage();
    String hintMessage(String remainTimeString);

    // 상품 목록
    List<ProductVO> listProducts();

    // 상품 상세
    ProductVO getProduct(String prdCode);

    // 추천 상품 목록
    List<ProductVO> listRecommendedProducts();
}