package co.yedam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.mapper.ProductMapper;
import co.yedam.vo.ProductVO;

public class ProductServiceImpl implements ProductService {

    SqlSession session = DataSource.getInstance().openSession(true);
    ProductMapper mapper = session.getMapper(ProductMapper.class);

    @Override
    public List<ProductVO> productList() {
        return mapper.selectList();
    }

    @Override
    public ProductVO getProduct(String productId) {
        return mapper.selectOne(productId);
    }

    @Override
    public String cheeringMessage() {
        return mapper.selectMessage();
    }

    @Override
    public String hintMessage(String remainTime) {
        return mapper.selectHint(remainTime);
    }
}
