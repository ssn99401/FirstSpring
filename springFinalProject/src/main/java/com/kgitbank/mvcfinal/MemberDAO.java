package com.kgitbank.mvcfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MemberDAO implements MemberInter{
	
	@Autowired
	SqlSessionTemplate my;

	@Override
	public void insert(MemberDTO memberDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int login(MemberDTO memberDTO) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
