package com.shxz.filter;

public class FaceFilter implements Filter{

	@Override
	public String dosomething(String request, FilterChain filterChain) {
		// TODO Auto-generated method stub
		System.out.println("����FaceFilter,�ҽ���ɫ��**");
		String temp=request.replace("��ɫ", "**");
		
		String response=filterChain.dosomething(temp, filterChain);
		System.out.println("����FaceFilter,�������");
		return response;
	}

}
