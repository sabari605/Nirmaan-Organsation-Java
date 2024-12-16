package day16;

public interface IAnimal {
                                                      
	String livingBeing="Animal";
	
	static boolean isMammal(String animalName) {
		return (animalName.equalsIgnoreCase("Dog"))||(animalName.equalsIgnoreCase("cat"))||(animalName.equalsIgnoreCase("human"));
	}
	default void Speak() {
		System.out.println("Animal making sound");
	}
	public void Move();
}
