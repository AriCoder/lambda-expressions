package com.ara.example03;

public class LambdaTest03 {

	public static void main(String []args) {
		calcular((x,y)->x+y);
		calcular((x,y)->x*y);
		calcular((x,y)->x/y);
		calcular((x,y)->x%y);
	}
	
	public static void calcular(Calculator cal) {
		int x=2,  y=4;
		int result=cal.calcular(x,y);
		System.out.println(result);
	}
}
