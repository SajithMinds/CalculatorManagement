package com.Calculator.Calculator;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sf=new Scanner(System.in);
		String options="";
		do {
		System.out.println("Enter the operation to perform(+,-,*,/,%)");
		char ch=sf.next().charAt(0);
		System.out.println("Enter the value of 'a':");
		double a=sf.nextDouble();
		System.out.println("Enter the value of 'b':");
		double b=sf.nextDouble();
		
		switch(ch) {
		case '+':
		{
			System.out.println("Addition of two numbers:"+a+"+"+b+"="+String.format("%.2f",a+b));
		} break;
		
		case '-':
		{
			System.out.println("Subtraction of two numbers:"+a+"-"+b+"="+String.format("%.2f",a-b));
		} break;
		
		case '*':
		{
			System.out.println("Multiplication of two numbers:"+a+"+*"+b+"="+String.format("%.2f",a+b));
		} break;
		
		case '/':
		{
			System.out.println("Division of two numbers:"+a+"/"+b+"="+String.format("%.2f",a/b));
		} break;
		
		case '%':
		{
			System.out.println("Addition of two numbers:"+a+"%"+b+"="+String.format("%.2f",a%b));
		} break;
		
		}
		System.out.println("Press Y to continue the operation:");
		options=sf.next();
		}while(options.equalsIgnoreCase("y"));
	}

}
