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
		// ----������ �̿��� ��ٱ��� ó��----
		// ��ٱ��ϰ� �ִ��� Ȯ��
		ArrayList<ProductDTO> list = (ArrayList<ProductDTO>) session.getAttribute("basket");
		// ������ �ű⿡ �߰��ؼ� �ٽ� �ֱ�
		if (list != null) {
			list.add(productDTO);
		}
		// ������ ������ֱ�
		else {
			list = new ArrayList<ProductDTO>();
			list.add(productDTO);
			
		}
		session.setAttribute("basket", list);
		System.out.println("--��ٱ���-- "+list.size()+"��");
		System.out.println(list);
		
		// ��ٱ����� �ѱݾ׵� ���ǿ� �����ϱ�
		
		
		int sum = 0;
		for (int i = 0;i < list.size(); i++) {
			ProductDTO dto = list.get(i);
			sum += Integer.parseInt(dto.getPrice());
		}
		session.setAttribute("total", sum);
		session.setAttribute("sum", list.size());
		
		
	}

}
