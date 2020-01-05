package com.kgitbank.mvcfinal;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO implements ProductInter{

	@Autowired
	SqlSessionTemplate my;
	//dependency injection(������ ����, di)
	//Inversion of Control(������ ����, IoC)
	
	@Override
	public List<ProductDTO> list() {
		return my.selectList("product.list");
	}

	@Override
	public ProductDTO select(ProductDTO productDTO) {
		return my.selectOne("product.one",productDTO);
	}

	@Override
	public void buy(ProductDTO productDTO) {
		
	}

	@Override
	public void basket(ProductDTO productDTO) {
		  
	}

}
