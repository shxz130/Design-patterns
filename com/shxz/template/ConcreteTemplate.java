package com.shxz.template;


import java.util.Arrays;


public class ConcreteTemplate extends AbstractTemplate{

	@Override
	void sort(int[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
	}
	public static void main(String[] args) {
		int [] a={3,43,54,43,43,2,5,342,54,43,6,43,7,43,75,43,76,87,65,43,32,2};
		AbstractTemplate template=new ConcreteTemplate();
		template.output(a);
	}
}
