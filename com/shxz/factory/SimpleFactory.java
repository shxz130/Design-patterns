package com.shxz.factory;

public class SimpleFactory {

    private Car car;  
    public Car createCar(String type)  
    {  
        if(type.equals("BigCar"))  
        {  
            return new BigCar();  
        }else if(type.equals("SmallCar")){  
            return new SmallCar();  
        }  
        return null;  
    }  
    
    public static void main(String[] args) {
    	SimpleFactory simpFactory=new SimpleFactory();  
        Car car=simpFactory.createCar("BigCar");  
        car.spleed();  
        car=simpFactory.createCar("SmallCar");  
        car.spleed();  
	}
}
