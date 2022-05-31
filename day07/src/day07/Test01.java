package day07;

import data.Calculator;

public class Test01 {
	
	String writer = "dongin";

	public static void main(String[] args) {

		Test01 t1 = new Test01();
		System.out.println(t1.writer);
		
		int cilcleValue = 10;
		System.out.println(cilcleValue*cilcleValue*Calculator.pi);
		
		System.out.println(Calculator.plus(3, 4));
		
		Calculator c1 = new Calculator();
	}

}
