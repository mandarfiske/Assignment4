package assignment4;

import java.util.Scanner;
public class Question9 {
	int num1;
	int num2;
	
	public Question9(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public int add()
	{
		if(num1<0 || num2<0)
		{
			throw new ArithmeticException("Number cannot be -ve");
		}
		return num1+num2;
	}
	public int sub()
	{
		if(num1<0 || num2<0)
		{
			throw new ArithmeticException("Number cannot be -ve");
		}
		return num1-num2;
	}
	public int mul()
	{
		if(num1==0 || num2==0)
		{
			throw new ArithmeticException("Number cannot be 0");
		}
		return num1*num2;
	}
	public double div()
	{
		if(num2==0)
		{
			throw new ArithmeticException("Denominator cannot be 0");
		}
		return (double)num1/num2;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Two Numbers : ");
		Scanner sc=new Scanner(System.in);
		try {
		String num1=sc.next();
		String num2=sc.next();
		Question9 exp=new Question9(Integer.parseInt(num1), Integer.parseInt(num2));
		System.out.println("Addition : "+exp.add());
		System.out.println("Substraction : "+exp.sub());
		System.out.println("Multiplication : "+exp.mul());
		System.out.println("Division : "+exp.div());
		
		}catch(NumberFormatException e){
			System.out.println(" Provide valid Inputs ");
			System.out.println(e.getMessage());
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
