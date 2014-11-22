package com.shxz.Observe;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Subject {
	private ArrayList<Observe> observers=new ArrayList<Observe>();
	public void removeObserve(Observe observe)
	{
		observers.remove(observe);
	}
	public void addObserve(Observe observe)
	{
		observers.add(observe);
	}
	public void notifyAllObservers(String newState)
	{
		for(Observe observe:observers)
		{
			observe.update(newState);
		}	
	}
}	
