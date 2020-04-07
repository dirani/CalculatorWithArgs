package com.java.calculatorwithargs;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String operator = args[0];
	double x = Double.parseDouble(args[1]);
	double y = Double.parseDouble(args[2]);
	double n = 0;
	
	switch(operator) {
			case("+"): {
				n = x+y;
				System.out.println(n);
				break;
			}
			case("-"): {
				n = x-y;
				System.out.println(n);
				break;
			}
			case("*"): {
				n = x*y;
				System.out.println(n);			
				break;
			}
			case("/"): {
				n = x/y;
				System.out.println(n);
				break;
			}
			case("%"): {
				n = x%y;
				System.out.println(n);
				break;
			}
			default: {
				throw new java.lang.Error("Operator not recognized");
			}
		}
	}
}
