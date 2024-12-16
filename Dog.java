package day16;

public class Dog implements IAnimal{

	@Override
	public void Move() {
		System.out.println("Dog run on four legs");
		
	}
	@Override
	public  void Speak() {
		System.out.println("the dog says woff");
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.Move();
		System.out.println(IAnimal.isMammal("Dog"));;
	}
}
