package day15;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Calculator cal= new Calculator ();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Addtion");
	  System.out.println(cal.add(sc.nextInt() ,sc.nextInt()));
	  System.out.println("sub");
	  System.out.println(cal.sub(sc.nextInt() ,sc.nextInt()));
	  System.out.println("mul");
	  System.out.println(cal.mul(sc.nextInt() ,sc.nextInt()));
	  System.out.println("div");
	  System.out.println(cal.div(sc.nextInt() ,sc.nextInt()));
	  
		
	}

}
