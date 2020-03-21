package ducks;

import interfaces.Fly;
import interfaces.Quack;
import main.Duck;

public class WildDuck extends Duck{

	public WildDuck(String name, Fly fl, Quack qk) {
		super(name, fl, qk);
		
	}

	@Override
	public void fly() {
		fl.fly();
		
	}

	@Override
	public void quack() {
		qk.quack();
		
	}

}
