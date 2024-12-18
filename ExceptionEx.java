package day18;

import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int c=0;
	try {
	System.out.println("Enter the frist value");
	
	int a=sc.nextInt();
	System.out.println("Enter the frist value");
	int b=sc.nextInt();
	 c=a/b;
	}catch(Exception e) {
		System.out.println(e);
		
	}
	System.out.println("program run success");
	System.out.println(c);

}
}
