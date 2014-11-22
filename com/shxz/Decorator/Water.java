package com.shxz.Decorator;

public abstract class Water {
	private String description="water";
	public abstract double cost();
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
