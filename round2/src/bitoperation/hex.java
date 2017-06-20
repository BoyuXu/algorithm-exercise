package bitoperation;

public class hex {
	public String hex(int number){
		String preflix = "0X";
		if(number == 0){
			return preflix + "0";
		}
		StringBuilder sb = new StringBuilder();
		while (number > 0){
			int rem = number % 16;
			if(rem < 10){
				sb.append((char)('0' + rem));
			}else {
				sb.append((char)('A' + rem - 10));
			}
			number >>>= 4;
		}
		return preflix + sb.reverse().toString();
	}
	public static void main(String [] args){
		hex x = new hex();
		System.out.println(x.hex(255));
	}
}
