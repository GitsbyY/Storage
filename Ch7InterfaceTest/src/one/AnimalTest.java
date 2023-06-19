package one;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String leg = "4발";
		String mouth = "입";
		
		
		Dog dog = new Dog();
		
	
		dog.walk();
		dog.run();
		dog.eat();
		dog.sleep();
		
		
		Rabbit rab = new Rabbit();
		
		
		rab.leg = leg;
		rab.mouth = mouth;
		
		rab.walk();
		rab.run();
		rab.eat();
		rab.cry();
		rab.sleep();
		
		Cat cat = new Cat();
		
		
		cat.leg = leg;
		cat.mouth = mouth;
		
		cat.walk();
		cat.run();
		cat.eat();
		cat.cry();
		cat.sleep();
		
		
	}

}
