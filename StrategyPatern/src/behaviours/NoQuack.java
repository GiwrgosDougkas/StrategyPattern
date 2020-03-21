package behaviours;

import interfaces.Quack;

public class NoQuack implements Quack{

	@Override
	public void quack() {
		System.out.println("No quack");
		
	}

}
