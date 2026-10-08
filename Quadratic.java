import java.util.Scanner;
public class Quadratic{

	public static void main(String[] args){
		
		
		int a,b,c;
		int x; 
		
		System.out.println("Enter your a");
		Scanner in1 = new Scanner(System.in);
		a = in1.nextInt();
		
		System.out.println("Enter your b");
		Scanner in2 = new Scanner(System.in);
		b = in2.nextInt();
		
		System.out.println("Enter your c");
		Scanner in3 = new Scanner(System.in);
		c = in3.nextInt();
		
		if ( a != 0 && Math.pow(b,2) - 4*a*c != 0){
			return answer();
		} else 
			System.out.println("No Solution");
		
	 		public static void answer(){
	
			sqrt = Math.pow(b,2) - 4*a*c;
	
			x = (b-2*b + Math.sqrt(sqrt))/ (2*a);
		}
	}
}
