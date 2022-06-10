package com.ara.example;

public class LambdaTest {

	public static void main(String args[]) {
		FunctionalTest functional=()->System.out.println("Hello world");
		LambdaTest ejemplo=new LambdaTest();
		ejemplo.miMetodo(functional);
	}
	
	public void miMetodo(FunctionalTest funcion) {
		funcion.saludar();
	}
}
