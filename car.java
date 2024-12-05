package Day10;

public class car {
	 String makes;
	 int year;
	  car(){
		  makes="Skoda";
		  year=1990;
	  }
car(String makes){
	this.makes=makes;
	year=2024;
}
car(String makes,int year){
	this.makes=makes;
	this.year=year;
}
 void displaycardetails() {
	 System.out.println(makes);
	 System.out.println(year);
 }
}
