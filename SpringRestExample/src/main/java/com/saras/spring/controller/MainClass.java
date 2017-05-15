package com.saras.spring.controller;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
	String stringValue();
	int intValue();
}

public class MainClass {
	
	@MyAnnotation(stringValue="udaya", intValue=100)
	public static void myMethod()
	{
		
	}

}
