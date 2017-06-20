package Singleton;

public class Singleton {
	private static final Singleton INSTANCE = new Singleton();
	private Singleton(){};//别人不能New singleton
	public static Singleton getInstance(){
		return INSTANCE; //别人得到的方法， 注意static
	}
	protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton");
	   }
}
	
