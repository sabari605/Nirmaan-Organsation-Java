package Day3;

public class Student {
	
	String StudentName="";
	String DateofBirth="";
	int RollNO =0;
	int Age=15;
public static void main(String []agrs) {
	Student Student1= new Student();
	Student1.StudentName="Manoji";
	Student1.DateofBirth="04/3/2050";
	Student1.RollNO=12343;
	Student1.Age=55;
	
	System.out.println(Student1.RollNO);
	
	Student Student2= new Student();
	Student2.StudentName="Manoji kumar";
	Student2.DateofBirth="04/1/2050";
	Student2.RollNO=12343;
	Student2.Age=2;
	
}
}
