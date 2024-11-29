package day6;

public class nirmaanOrg {
	int id=0;
	String name="";
	float salry=0;
	String deparment="";
	void chekIN() {
		System.out.println("Empolye Present");
	}
	void chekOut() {
		System.out.println("Empolye leave");
	}
	public static void main(String[] agrs) {
		
		nirmaanOrg emp1=new nirmaanOrg();
		emp1.id=0;
		emp1.name="sabari";
		emp1.salry=1223.3f;
		emp1.deparment="CSE";
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.salry);
		System.out.println(emp1.deparment);
		emp1.chekIN();
		System.out.println("");
		
		nirmaanOrg emp2=new nirmaanOrg();
		emp2.id=0;
		emp2.name="sabari";
		emp2.salry=1223.3f;
		emp2.deparment="CSE";
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.salry);
		System.out.println(emp2.deparment);
		emp2.chekOut();
		System.out.println("");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
