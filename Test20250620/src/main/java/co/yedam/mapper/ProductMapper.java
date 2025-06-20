package co.yedam.mapper;

import java.util.List;
import co.yedam.vo.ProductVO;

public interface ProductMapper {
    // 기존 메소드
    String selectMessage();
    String selectHint(String remainTimeString);

    // 상품 목록 조회
    List<ProductVO> selectProductList();

    // 상품 단건 조회
    ProductVO selectProduct(String prdCode);

    // 평점 높은 순 상품 조회 (추천 상품용)
    List<ProductVO> selectListByStar();
}