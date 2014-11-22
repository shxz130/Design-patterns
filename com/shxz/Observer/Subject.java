package com.shxz.Observer;

import java.util.Observable;

public class Subject extends Observable{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers(this.name);
	}
}
