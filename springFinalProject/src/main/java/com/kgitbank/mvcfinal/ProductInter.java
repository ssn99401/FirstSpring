package com.kgitbank.mvcfinal;

import java.util.List;

public interface ProductInter {
	
	//��ü �˻�
	List<ProductDTO> list();
	
	//�Ѱ� �˻�
	ProductDTO select(ProductDTO productDTO);
	
	//����
	void buy(ProductDTO productDTO);
	
	//��ٱ���
	void basket(ProductDTO productDTO);
	
}
