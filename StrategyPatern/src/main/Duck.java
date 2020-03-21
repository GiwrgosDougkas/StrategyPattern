package main;

import interfaces.Fly;
import interfaces.Quack;

public abstract class Duck {
	
	protected Fly fl;
	protected Quack qk;
	protected String name;
	
	public Duck(String name, Fly fl, Quack qk) {
		this.name=name;
		this.fl=fl;
		this.qk=qk;
	}
	
	
	public abstract void fly();
	public abstract void quack();
	
	public String getName() {
		return this.name;
	}
}
