package com.shxz.filter;

public class FaceFilter implements Filter{

	@Override
	public String dosomething(String request, FilterChain filterChain) {
		// TODO Auto-generated method stub
		System.out.println("我是FaceFilter,我将黄色改**");
		String temp=request.replace("黄色", "**");
		
		String response=filterChain.dosomething(temp, filterChain);
		System.out.println("我是FaceFilter,处理完毕");
		return response;
	}

}
