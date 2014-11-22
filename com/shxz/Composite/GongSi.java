package com.shxz.Composite;

public abstract class GongSi {
	protected String name;
	public GongSi(String name)
	{
		this.name=name;
	}
	public void ShowName()
	{
		System.out.println(name);
	}
	public abstract void add(GongSi gongSi);
	public abstract void remove(GongSi gongSi);
	public abstract void iterate();
}
