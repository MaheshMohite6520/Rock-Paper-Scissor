import java.util.Random;
import java.util.Scanner;

public class Project_2
{
    public static void main(String[] args)
    {
        // Simple Game(Rock-Paper-Scissor) using Random Number Function

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 for Rock: ");
        System.out.println("Enter 1 for Paper: ");
        System.out.println("Enter 2 for Scissor: ");

        System.out.println("Enter your choice: ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);  // Starting from 0

        if(userInput == computerInput)
        {
            System.out.println("Draw");
        }
        else if ( userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1 )
        {
            System.out.println("You Win");
        }
        else
        {
            System.out.println("Computer Win");
        }

        if (computerInput == 0)
        {
            System.out.println("Computer choice: Rock");
        } else if (computerInput == 1)
        {
                System.out.println("Computer choice: Paper");
        }
        else if (computerInput == 2)
        {
            System.out.println("Computer choice: Scissor");
        }
    }
}
