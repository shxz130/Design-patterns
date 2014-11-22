package com.shxz.filter;

import java.util.ArrayList;

public class FilterChain implements Filter{
	ArrayList<Filter> list=new ArrayList<>();	
	int index=0;
	public void add(Filter filter){
		list.add(filter);
	}
	public void remove(Filter filter){
		list.remove(filter);
	}
	@Override
	public String dosomething(String request, FilterChain filterChain) {
		// TODO Auto-generated method stub
		if(index==list.size())
		{
			return request;
		}
		else{
		Filter filter=list.get(index);
		index++;
		return filter.dosomething(request, filterChain);
		
		}
	}
	
	public static void main(String[] args) {
		FilterChain chain=new FilterChain();
		chain.add(new HtmlFilter());
		chain.add(new FaceFilter());
		chain.add(new SesstiveFilter());
		
		String request="<html> 郭老板喜欢看黄色电影</html>";
		String getrequest=chain.dosomething(request, chain);
		System.out.println(getrequest);

	}
}
