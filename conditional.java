package day2;

import java.util.Scanner;



public class conditional {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice");
	System.out.println("0 for add");
	System.out.println("1 for sub");
	System.out.println("2 for mul");
	System.out.println("3 for divi");
	System.out.println("4 for module");
	
	
	 int key=sc.nextInt();
	 
if(key==0) {
	
	 System.out.println("Enter the fristNUM");
	 int fristNUM=sc.nextInt();
	 System.out.println("Enter the secondtNUM");
	 int secondNUM=sc.nextInt();
	 int total=fristNUM+secondNUM;
	 System.out.println("total :"+total);
	  }

else if(key==1) {

System.out.println("Enter the fristNUM");
int fristNUM=sc.nextInt();
System.out.println("Enter the secondtNUM");
int secondNUM=sc.nextInt();
int total=fristNUM-secondNUM;
System.out.println("total :"+total);
 }

else if(key==2) {

System.out.println("Enter the fristNUM");
int fristNUM=sc.nextInt();
System.out.println("Enter the secondtNUM");
int secondNUM=sc.nextInt();
int total=fristNUM*secondNUM;
System.out.println("total :"+total);
 }


else if(key==3) {

System.out.println("Enter the fristNUM");
int fristNUM=sc.nextInt();
System.out.println("Enter the secondtNUM");
int secondNUM=sc.nextInt();
int total=fristNUM/secondNUM;
System.out.println("total :"+total);
 }

else if(key==4) {

System.out.println("Enter the fristNUM");
int fristNUM=sc.nextInt();
System.out.println("Enter the secondtNUM");
int secondNUM=sc.nextInt();
int total=fristNUM%secondNUM;
System.out.println("total :"+total);
 }

else 
	
{
	System.out.println("enter your choiche");
	
	}
switch (key) {
case 0:{
	 System.out.println("Enter the fristNUM");
	 int fristNUM=sc.nextInt();
	 System.out.println("Enter the secondtNUM");
	 int secondNUM=sc.nextInt();
	 int total=fristNUM+secondNUM;
	 System.out.println("total :"+total);
	 break;
	
}


 case 1: {
	 System.out.println("Enter the fristNUM");
	 int fristNUM=sc.nextInt();
	 System.out.println("Enter the secondtNUM");
	 int secondNUM=sc.nextInt();
	 int total=fristNUM-secondNUM;
	 System.out.println("total :"+total);
	 break;

 }
 case 2 :{
	 System.out.println("Enter the fristNUM");
	 int fristNUM=sc.nextInt();
	 System.out.println("Enter the secondtNUM");
	 int secondNUM=sc.nextInt();
	 int total=fristNUM*secondNUM;
	 System.out.println("total :"+total);
	 break;
	
}
 case 3:{
	 System.out.println("Enter the fristNUM");
	 int fristNUM=sc.nextInt();
	 System.out.println("Enter the secondtNUM");
	 int secondNUM=sc.nextInt();
	 int total=fristNUM/secondNUM;
	 System.out.println("total :"+total);
	 break;
	
}
 case 4:{
	 System.out.println("Enter the fristNUM");
	 int fristNUM=sc.nextInt();
	 System.out.println("Enter the secondtNUM");
	 int secondNUM=sc.nextInt();
	 int total=fristNUM%secondNUM;
	 System.out.println("total :"+total);
	 break;
	
}
 

	default:
		 System.out.println("Entre your correct choiche");
}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

