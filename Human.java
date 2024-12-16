package day16;

public class Human implements IAnimal{

	
		@Override
		public void Move() {
			System.out.println("human run walk");
			
		}
		@Override
		public  void Speak() {
			System.out.println("Human sound");
		}
		public static void main(String[] args) {
			Human hu=new Human();
			hu.Move();
			System.out.println(IAnimal.isMammal("Human"));;
		}
	}
