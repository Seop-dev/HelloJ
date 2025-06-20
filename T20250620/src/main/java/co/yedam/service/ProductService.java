package co.yedam.service;

import java.util.List;
import co.yedam.vo.ProductVO;

public interface ProductService {
    List<ProductVO> productList();
    ProductVO getProduct(String productId);

    // 메시지 관련
    String cheeringMessage();
    String hintMessage(String remainTime);
}
