package com.kgitbank.mvcfinal;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	ProductDAO dao;

	@RequestMapping("product")
	public void list(Model model) {
		List<ProductDTO> list = dao.list();
		model.addAttribute("list", list);
	}

	@RequestMapping("one")
	public void select(ProductDTO productDTO, Model model) {
		ProductDTO dto = dao.select(productDTO);
		model.addAttribute("dto", dto);
	}

	@RequestMapping("basket")
	public void basket(ProductDTO productDTO, HttpSession session) {
		// ----세션을 이용한 장바구니 처리----
		// 장바구니가 있는지 확인
		ArrayList<ProductDTO> list = (ArrayList<ProductDTO>) session.getAttribute("basket");
		// 있으면 거기에 추가해서 다시 넣기
		if (list != null) {
			list.add(productDTO);
		}
		// 없으면 만들어주기
		else {
			list = new ArrayList<ProductDTO>();
			list.add(productDTO);
			
		}
		session.setAttribute("basket", list);
		System.out.println("--장바구니-- "+list.size()+"개");
		System.out.println(list);
		
		// 장바구니의 총금액도 세션에 저장하기
		
		
		int sum = 0;
		for (int i = 0;i < list.size(); i++) {
			ProductDTO dto = list.get(i);
			sum += Integer.parseInt(dto.getPrice());
		}
		session.setAttribute("total", sum);
		session.setAttribute("sum", list.size());
		
		
	}

}
