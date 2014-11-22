package com.shxz.bridge;

public class Street extends Load{
	public Street(Car car){
		this.car=car;
	}
	
	@Override
	public void display(){
		super.display();
		System.out.println("on the SpeedWay");
	}
	
	public static void main(String[] args) {
		Car car=new BigCar();
		Load load=new Street(car);
		load.display();
		
		Car car2=new SmallCar();
		Load load2=new SpeedWay(car2);
		load2.display();
		
	}
}
