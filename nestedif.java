package day3;

import java.util.Scanner;

public class nestedif {


public static void main(String[]agrs) {

	Scanner sc=new Scanner (System.in);

	System.out.println("Enter your mark");
	int  mark=sc.nextInt();
	if(mark>35) {
		System.out.println("Pass");
		if (mark>90) {
			System.out.println("gradeA");
		}
		else if (mark>70) { 
			System.out.println("grade b");
		}
			else if(mark>50) {
				System.out.println("grade c");
			}
			
				else if (mark>45) {
					System.out.println("grade d");
				}
					
	}else {
						System.out.println("fail");
					}
		}
}