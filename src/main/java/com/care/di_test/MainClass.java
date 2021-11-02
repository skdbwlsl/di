package com.care.di_test;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String []args) {
		String path = "classpath:application_test.xml";
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		PrintBean printBean = ctx.getBean("pb",PrintBean.class); //해당하는 빈 얻어오기
		printBean.printString();
	}
}

