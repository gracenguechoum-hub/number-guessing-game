import java.util.Random;
import java.util.Scanner;

public class project{
    public static void main (String[]args){
        System.out.println("hello you should guess my number and you have five attemps");
        Random random=new Random();
        int number=random.nextInt(100)+1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter my number");
        int n =scanner.nextInt();
        boolean hasWon = false;
        for (int i = 0; i < 5; i++) {
            if (number<n) {
                System.out.println("it is lower than that");
                System.out.print("enter another number" );
                n=scanner.nextInt();
            } else if (number>n) {
                System.out.println("it is higher than that");
                System.out.print("enter another number" );
                n=scanner.nextInt();
            }else{
                hasWon = true;
                System.out.println("congratulations.you found the number "+number);
            }
        }
        if (!hasWon) {
            System.out.println("Game over! The secret number was: " + number);
        }
        scanner.close();
    } 
}