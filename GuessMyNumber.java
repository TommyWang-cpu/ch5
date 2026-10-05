import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber {
	
    public static void main(String[] args) {

        int number;
        int numberGuessed;
        int attempt = 0;

        Random random = new Random();
        
        Scanner in = new Scanner(System.in);

        number = random.nextInt(100) + 1;

        System.out.println("Guess a number between 1-100 (includes 1 or 100)");
        
		System.out.println(number);
		
        while (attempt < 3) {

            numberGuessed = in.nextInt();
            attempt++;

            if (numberGuessed == number) {
                System.out.println("You got it!");  
                attempt = 3;
            } else if (attempt == 3) {
                System.out.println("You fail! The number was " + number);
            }

            if (numberGuessed < number) {
                System.out.println("Your number is too low");
            } else if (numberGuessed > number){
                System.out.println("Your number is too high"); 
			}
 
        }

    }
}
