package com.shxz.filter;

public class SesstiveFilter implements Filter{

	@Override
	public String dosomething(String request, FilterChain filterChain) {
		// TODO Auto-generated method stub
		System.out.println("����SesstiveFilter,�ҽ����ϰ��Ϊ����");
		String temp=request.replace("���ϰ�", "����");

		String response=filterChain.dosomething(temp, filterChain);
		System.out.println("����SesstiveFilter,�������");
		return response;
	}

}
