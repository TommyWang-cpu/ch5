import java.util.Scanner;
public class Fermat{
	
	public static void main(String[] args) {
	int a,b,c;
	int n;
	
	System.out.println("Fermat’s Last Theorem says that there are no integers 𝑎,𝑏,𝑐, and 𝑛 such that 𝑎^𝑛 +𝑏^𝑛 =𝑐^𝑛, except when 𝑛 ≤2.");
	System.out.println("Eneter your n");
	
	Scanner in1 = new Scanner(System.in);
	n = in1.nextInt();
	
	System.out.println("Eneter your a");
	Scanner in2 = new Scanner(System.in);
	a = in2.nextInt();
	
	System.out.println("Eneter your b");
	Scanner in3 = new Scanner(System.in);
	b = in3.nextInt();
		
	System.out.println("Eneter your c");
	Scanner in4 = new Scanner(System.in);
	c = in4.nextInt();
	


	
	
	if (n > 2 && Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n))
		System.out.println("Holy smokes, Fermat was wrong!");
	else 
		System.out.println("No, that doesn’t work.");
		
}
}
