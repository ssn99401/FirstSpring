package com.kgitbank.mvcfinal;

public interface MemberInter {
	//������ ��ɿ� ���ؼ� ����
	//1. ȸ������
	void insert(MemberDTO memberDTO);
	//2. �α���
	int login(MemberDTO memberDTO);
	
}
