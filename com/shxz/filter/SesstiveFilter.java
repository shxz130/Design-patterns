package com.shxz.filter;

public class SesstiveFilter implements Filter{

	@Override
	public String dosomething(String request, FilterChain filterChain) {
		// TODO Auto-generated method stub
		System.out.println("我是SesstiveFilter,我将郭老板改为郭金康");
		String temp=request.replace("郭老板", "郭金康");

		String response=filterChain.dosomething(temp, filterChain);
		System.out.println("我是SesstiveFilter,处理完毕");
		return response;
	}

}
