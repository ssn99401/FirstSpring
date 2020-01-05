package com.kgitbank.mvcfinal;

public interface MemberInter {
	//구현할 기능에 대해서 정의
	//1. 회원가입
	void insert(MemberDTO memberDTO);
	//2. 로그인
	int login(MemberDTO memberDTO);
	
}
