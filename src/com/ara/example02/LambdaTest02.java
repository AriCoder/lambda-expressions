package com.ara.example02;

public class LambdaTest02 {

	public static void main(String[] args) {
		LambdaTest02 test=new LambdaTest02();
		test.printOperation((n1,n2)->System.out.println("numero1 "+n1+" numero2 "+n2),10,20);
		test.printOperation((n1,n2)->System.out.println("Resultado de la multiplicacion "+(n1*n2)),1,2);
	}
	
	public void printOperation(Operations op, int n1, int n2) {
		op.operation(n1,n2);
	}

}
