package assignment4;
import java.util.Scanner;
public class Question10 {

	public static void convertInt(String input)
	{
		int num=Integer.parseInt(input);
		if(num<Integer.MIN_VALUE || num>Integer.MAX_VALUE)
		{
			throw new IllegalArgumentException();
		}
	}
	public static void main(String[] args) {
		System.out.println((Integer.MAX_VALUE));
		System.out.println((Integer.MIN_VALUE));
		try {
		System.out.println("Enter the Number : ");
		Scanner sc= new Scanner(System.in);
		String num=sc.next();
		sc.close();
		convertInt(num);
		System.out.println("The String is converted to integer Successfully");
		}catch(IllegalArgumentException e)
		{
			System.out.println("Number should not exceeds the range on int");
		}
		
		

	}

}

