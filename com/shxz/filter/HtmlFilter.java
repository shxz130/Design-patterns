package com.shxz.filter;

import javax.swing.RepaintManager;

public class HtmlFilter implements Filter{

	@Override
	public String dosomething(String request, FilterChain filterChain) {
		// TODO Auto-generated method stub
		System.out.println("����htmlFilter,�ҽ�<html>��Ϊ���Ǳ�ǩ");
		String temp=request.replace("<html>", "���Ǳ�ǩ");

		String response=filterChain.dosomething(temp, filterChain);
		System.out.println("����htmlFilter,�������");
		return response;
	}

}
