package basic;

public abstract class Employee {
	private final String name;
	private final String id;
	private int age;
	private int level;
	private int salary;
	
	public Employee(String name, int age, String id, int level){
		this.id = id;
		this.name = name;
		this.age = age;
		this.level = level;
	}
	
	public void printlninfo() {
		System.out.println("Name:" + name + ";Age:" + age +";ID:"+id);
	}
	
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public int getSalary(){
		return salary;
	}
	public int getLevel(){
		return level;
	}
	
	public abstract int calculateSalary(double performancescore);
}

