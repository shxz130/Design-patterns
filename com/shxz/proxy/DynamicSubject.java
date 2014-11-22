package com.shxz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import javax.naming.spi.InitialContextFactory;

public class DynamicSubject implements InvocationHandler ,Subject{

	private Object object;
	
	public DynamicSubject(Object object){
		this.object=object;
	}
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before method:"+method);
		method.invoke(object, args);
		System.out.println("after Calling:"+method);
		return null;
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub	
	}
}
