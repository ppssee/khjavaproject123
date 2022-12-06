package testcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Animal> list = new ArrayList<Animal>();
		list.add(new Animal());
		
		list.add(new Cat());
		list.add(new Dog());
		
		list.get(0).eat();
		list.get(1).eat();
		list.get(2).eat();
		
		Animal[] ani = new Animal[10];
		
		ani[0] = new Dog();
		ani[1] = new Cat();
		ani[2] = new Animal();
		
		
		
		
	} 
}
