package com.shxz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] orgs)
	{
		RealSubject realSubject=new RealSubject();
		InvocationHandler invocationHandler=new DynamicSubject(realSubject);

		Class classType=invocationHandler.getClass();
		
		ClassLoader tem=classType.getClassLoader();
		Subject subject=(Subject) Proxy.newProxyInstance(tem, 
				classType.getInterfaces(),invocationHandler);
		subject.request();
		
		System.out.println(subject.getClass());
	}

}
