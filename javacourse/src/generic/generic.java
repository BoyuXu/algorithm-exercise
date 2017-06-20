package generic;

import java.util.ArrayList;
import java.util.List;

public class generic {
	public class Fruit {
		public void printout(){
			System.out.println("this is fruit");
		}
	}
	public class Apple extends Fruit{
		@Override
		public void printout(){
			System.out.println("this is apple");
		}
	}
	public class Orange extends Fruit{
		@Override
		public void printout(){
			System.out.println("this is orange");
		}
	}
	
	
	public static void main (String [] args) {
		generic c = new generic();
		List<Apple> apples = new ArrayList<>();
		List<? extends Fruit> fruits = apples;
		Apple apple = c.new Apple();
		apples.add(apple);
		Fruit fruit = fruits.get(0);
		Apple apple2 = (Apple) fruits.get(0);
		System.out.println(fruit);
		
		weekday today = weekday.Monday;
	}
}
