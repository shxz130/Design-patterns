package com.shxz.template;

import java.util.Iterator;

public abstract class AbstractTemplate {
	public void init(){
		System.out.println("¿ªÊ¼¼ÆËã");
	}
	abstract void sort(int[] a);
	public void output(int [] a)
	{
		sort(a);
		for(int i=0; i<a.length; i++)
		{
			System.out.print("\t"+a[i]);
		}
	}
}
