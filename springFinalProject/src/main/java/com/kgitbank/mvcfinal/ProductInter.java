package com.kgitbank.mvcfinal;

import java.util.List;

public interface ProductInter {
	
	//전체 검색
	List<ProductDTO> list();
	
	//한개 검색
	ProductDTO select(ProductDTO productDTO);
	
	//구매
	void buy(ProductDTO productDTO);
	
	//장바구니
	void basket(ProductDTO productDTO);
	
}
