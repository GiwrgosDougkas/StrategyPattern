package main;

import java.util.ArrayList;
import java.util.List;

import behaviours.*;

import ducks.*;


public class Main {
	private static List<Duck> ducks=new ArrayList<>();
	public static void main(String[] args) {
		
		ducks.add(new LakeDuck("Lake",new HighFly(),new NoQuack()));
		ducks.add(new MountainDuck("Mountain",new SmallFly(), new NoQuack()));
		ducks.add(new VillageDuck("Village", new SmallFly(), new LoudQuack()));
		ducks.add(new WildDuck("Wild",new HighFly(), new LoudQuack()));
		
		for(Duck duck: ducks) {
			
			System.out.println("Duck "+(ducks.indexOf(duck)+1)+ " Settings:"   );
			System.out.println(duck.getName());
			duck.fly();
			duck.quack();
			System.out.println("----End-----");
			
			
		}
		
		
		
		
	}

}
