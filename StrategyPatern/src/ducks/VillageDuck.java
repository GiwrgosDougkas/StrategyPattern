package ducks;

import interfaces.Fly;
import interfaces.Quack;
import main.Duck;

public class VillageDuck extends Duck {

	public VillageDuck(String name, Fly fl, Quack qk) {
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
