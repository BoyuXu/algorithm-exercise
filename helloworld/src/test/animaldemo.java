package test;

import boyu2.animal;
import boyu2.cat;
import boyu2.dog;

public class animaldemo {
public static void main(String args[]){
	animal a=new cat();
	a.eat();
	a.sleep();
	a=new dog();
	a.eat();
	a.sleep();
	dog d=(dog)a;
	d.jump();
			
}
}