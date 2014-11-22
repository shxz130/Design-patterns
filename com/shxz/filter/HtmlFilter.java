package com.shxz.filter;

import javax.swing.RepaintManager;

public class HtmlFilter implements Filter{

	@Override
	public String dosomething(String request, FilterChain filterChain) {
		// TODO Auto-generated method stub
		System.out.println("我是htmlFilter,我将<html>改为我是标签");
		String temp=request.replace("<html>", "我是标签");

		String response=filterChain.dosomething(temp, filterChain);
		System.out.println("我是htmlFilter,处理完毕");
		return response;
	}

}
