import java.util.Scanner;

public class Triangle{
	
	public static void main(String[] args){
		
		//If any of the three lengths is greater than the sum of the other two, 
		//you cannot form a triangle.
		
		int a,b,c; 
		
		Scanner in = new Scanner(System.in);
			
		System.out.println("Enter 1st length");
		a = in.nextInt();
		
		System.out.println("Enter 2nd length");
		b = in.nextInt();
		
		System.out.println("Enter 3rd length");
		c = in.nextInt();
		
		int ab = a + b;
		int ac = a + c;
		int bc = b + c;
		
		if ( a >= 0 && b >= 0 && c >= 0){
			if ( a <= ab && a <= ac && a <= bc){
				System.out.println("You triangle works!");
			} else 
				System.out.println("Sorry, that does not work!");
		}else
			System.out.println("Negative or zero, seriously?");
		
	}
	public static boolean check(){
		
	}
}
