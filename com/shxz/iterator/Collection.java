package com.shxz.iterator;

public class Collection implements Iterator{

	String[] Array;
	int cursor=0;

	public Collection(String[] Array){
		this.Array=Array;
	}
	@Override
	public boolean hasnext() {
		// TODO Auto-generated method stub
		if(cursor==Array.length)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return Array[cursor++];
	}
	public static void main(String[] args) {
		String [] a=new String[]{"zhangsan","lisi","wangmazi","doubi"};
		Collection conllection=new Collection(a);
		while(conllection.hasnext())
		{
			System.out.println((String)conllection.next());
		}
	}
}
