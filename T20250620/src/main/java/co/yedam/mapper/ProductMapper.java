package co.yedam.mapper;

import java.util.List;
import co.yedam.vo.ProductVO;

public interface ProductMapper {
    List<ProductVO> selectList();
    ProductVO selectOne(String productId);

    // 메시지 관련 메서드
    String selectMessage(); // cheer message
    String selectHint(String remainTimeString); // hint message
}
