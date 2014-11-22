package com.shxz.builder;

public class ConcreteBuilder extends Builder{

	Product product;
	public ConcreteBuilder()
	{
		product=new Product();
	}
	
	@Override
	void addWater() {
		// TODO Auto-generated method stub
		product.setWater(32);
		System.out.println("builder1 addWater");
	}

	@Override
	void addRice() {
		// TODO Auto-generated method stub
		product.setRice(13);
		System.out.println("builder1 addRice");
	}

	@Override
	void boiling() {
		product.setBoided(true);
		// TODO Auto-generated method stub
		System.out.println("builder1 boiling");
	}
	@Override
	public Product getProduct(){
		return product;
	}
}
