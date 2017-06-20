package overrideequals;

public class Coordinate {
	public int x;
	public int y;
	public Coordinate(int x,int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object object){
		if(object == this){
			return true;
		}
		if(!(object instanceof Coordinate)){
			return false;
		}
		Coordinate another = (Coordinate)object;
		return this.x == another.x && this.y == another.y;
	}
	public static void main(String [] args){
		Coordinate a = new Coordinate(0, 0);
		Coordinate b = new Coordinate(0, 0);
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}
}
