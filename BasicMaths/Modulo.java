package BasicMaths;
public class Modulo {

	public static void main(String args[ ]) {
	 long a=1000000007L;
		long b= 1000000007L;
		long  n1;
		n1=(long) ((Math.pow(10,9))+7);
		a = ((a%n1)*(b%n1))%n1;
		
		System.out.println(a);
		
		
	}
}
