package day16;

public class Brid implements IAnimal {


	@Override
	public void Move() {
		System.out.println("The brids files in the sky");
		
	}
	@Override
	public  void Speak() {
		System.out.println("The brids Says Chrip");
	}
public static void main(String[] args) {
	Brid brid= new Brid();
	brid.Move();
	brid.Speak();
	System.out.println(IAnimal.isMammal("bird"));;
}
}
