package assignment4;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		try {
		String num=sc.next();
		int num1=Integer.parseInt(num);
		int square;
		square=num1*num1;
		System.out.println(square);
		}catch(Exception e){
			System.out.println("Enter only number ");
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		
	}

}
