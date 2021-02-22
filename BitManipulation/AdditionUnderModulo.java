package BitManipulation;


public class AdditionUnderModulo {
	public static void main(String args[ ]) {
		long a = 9223372036854775807L ;
		long b = 9223372036854775807L ;
	

		long e = (long)(Math.pow(10,9) +7);
		long  g =  (a  % e);
	    long n=   (b   % e);
	    long m =   ((g+n) % e);
	   
    
    System.out.println( m);
}
}