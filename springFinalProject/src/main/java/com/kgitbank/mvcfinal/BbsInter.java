package com.kgitbank.mvcfinal;

import java.util.ArrayList;

public interface BbsInter {
	//1. ��ü �˻� ���
	ArrayList<BbsDTO> list();
	
	//2. �ϳ� �˻� ���
	BbsDTO select(BbsDTO bbsDTO);
	
	//3. �Խ��� �ۼ� ���
	void insert(BbsDTO bbsDTO);
}
