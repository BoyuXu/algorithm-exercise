package s;

public class aa {
 public void oo (int x){
	 if(x<=0){
		 return;
	 }
	 oo(x-1);
	 System.out.println(x);
 }
 
 public static void main (String [] args){
	 aa a = new aa();
	 a.oo(10);
 }
}
