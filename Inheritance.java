package day14;
class animal{
	void sound() {
		System.out.println("Animal sound in zoo");
	}
	void eat(){
		System.out.println("Animal  an Eat");
		
	}
}

class Lino extends animal {
	void sound () {
		System.out.println("lino");
	}
}
	
	class Cat extends animal {
		void eat () {
			System.out.println("cat");
		}
		
	
}


public class Inheritance {
	public static void main(String[] args) {
		Lino lino=new Lino();
		lino.sound();
		Cat cat=new Cat();
		cat.eat();
	}
}




