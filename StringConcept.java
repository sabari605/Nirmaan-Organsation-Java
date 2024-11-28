package Day3;
 import java.util.Scanner;
public class StringConcept {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your Name");
	    String Name =sc.nextLine();
	    System.out.println(Name.substring (0,7));
	}

}
