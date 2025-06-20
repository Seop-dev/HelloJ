package co.yedam.vo;

import lombok.Data;

@Data
public class ProductVO {
    private String productId;
    private String name;
    private String image;
    private int priceOld;
    private int priceNew;
    private int rating; // 별점 1~5
}
