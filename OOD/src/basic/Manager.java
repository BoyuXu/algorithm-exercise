package basic;

public class Manager extends Employee {
	public Manager(){
		super("ss",2,"ss",2);
	}
	@Override
	public int calculateSalary(double performanceScore){
		return (int) (2*(1 + 0.25*performanceScore));
	}
	public static void main (String []args){
		Employee a = new Manager();
		System.out.println(a.calculateSalary(2));
	}
}

