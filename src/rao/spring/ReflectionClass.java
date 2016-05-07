package rao.spring;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ReflectionClass  {
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
//		Object clz =Class.forName("rao.spring.SpringStartUp");
		Object obj = new SpringStartUp();
		obj.getClass();
		Method aa=  obj.getClass().getDeclaredMethod("myMethod", null);
		aa.invoke(obj, null);
		obj.hashCode();
	}  
	 
	ReflectionClass(){
	System.out.println();	
	}
}
