package com.shxz.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	 private Map<Character,FlyWeight> files = new HashMap<Character,FlyWeight>();
	    
	    public FlyWeight factory(Character state){
	        //�ȴӻ����в��Ҷ���
	        FlyWeight fly = files.get(state);
	        if(fly == null){
	            //������󲻴����򴴽�һ���µ�Flyweight����
	            fly = new ConcreteFlyWeight(state);
	            //������µ�Flyweight������ӵ�������
	            files.put(state, fly);
	        }
	        return fly;
	    }
	    
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        FlyWeightFactory factory = new FlyWeightFactory();
	        FlyWeight fly = factory.factory(new Character('a'));
	        fly.operation("First Call");
	        
	        fly = factory.factory(new Character('b'));
	        fly.operation("Second Call");
	        
	        fly = factory.factory(new Character('a'));
	        fly.operation("Third Call");
	    }
}
