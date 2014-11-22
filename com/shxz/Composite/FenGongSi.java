package com.shxz.Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class FenGongSi extends GongSi{

	private ArrayList<GongSi> list=new ArrayList<GongSi>();
	public FenGongSi(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(GongSi zongGongSi) {
		// TODO Auto-generated method stub
		list.add(zongGongSi);
	}
	@Override
	public void remove(GongSi gongSi) {
		// TODO Auto-generated method stub
		list.remove(gongSi);
	}

	@Override
	public void iterate() {
		// TODO Auto-generated method stub
		System.out.println(name);
		  for (GongSi c : list) {  
             c.iterate();
          }  
	}
}
