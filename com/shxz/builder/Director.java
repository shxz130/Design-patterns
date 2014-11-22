package com.shxz.builder;

public class Director {
	private Builder builder;

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public void getResult(){
		builder.addWater();
		builder.addRice();
		builder.boiling();
		System.out.println(builder.getProduct());
		
	}
	
	public static void main(String[] args) {
		Builder builder=new ConcreteBuilder();
		Director director=new  Director();
		director.setBuilder(builder);
		director.getResult();
	}
}
