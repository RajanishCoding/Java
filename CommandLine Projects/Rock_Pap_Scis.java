// Rock, Paper, Scissor, with Computer, using Random
import java.util.Scanner;
import java.util.Random;

public class Rock_Pap_Scis 
{
    public static void main(String a[]) 
    {
        int CompScore = 0, UserScore = 0, Draw = 0, Round = 1, CompChoice, UserChoice;
 
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\n-----> Enter '0' for Rock, '1' for Paper, '2' for Scissor <-----");

        while(Round <= 10)
        {
            CompChoice = rand.nextInt(3);

            System.out.print("\nEnter your Choice : ");
            UserChoice = scan.nextInt();

            while (UserChoice < 0 || UserChoice > 2)
            {
                System.out.println("\nYou entered wrong Number, Please enter according to Instructions Below...");
                System.out.println("-----> Enter '0' for Rock, '1' for Paper, '2' for Scissor <-----");
                System.out.print("\nEnter your Choice : ");
                UserChoice = scan.nextInt();
            }

            System.out.println();
            switch(UserChoice)
            {
                case 0 -> System.out.println("You Chose Rock");
                case 1 -> System.out.println("You Chose Paper");
                case 2 -> System.out.println("You Chose Scisor");
            }
            
            switch(CompChoice)
            {
                case 0 -> System.out.println("Computer Chose Rock");
                case 1 -> System.out.println("Computer Chose Paper");
                case 2 -> System.out.println("Computer Chose Scisor");
            }

            if(CompChoice == 0 && UserChoice == 1 || CompChoice == 1 && UserChoice == 2 || CompChoice == 2 && UserChoice == 0)
            {
                System.out.println("You Won Round " + Round);
                UserScore++;
            }
            else if(CompChoice == UserChoice)
            {
                System.out.println("Round " + Round + " is Draw");
                Draw++;
            }
            else
            {
                System.out.println("Computer Won Round " + Round);
                CompScore++;
            }
            
            if(UserChoice == 6 || CompChoice == 6)
            {
                break;
            }

            Round++;
        }

        System.out.println("\nWons : " + UserScore + "  |  Losses : " + CompScore + "  |  Draws : " + Draw);

        if(UserScore > CompScore)
        {
            System.out.println("You Won the Match");
        }
        else if(Draw > UserScore && Draw > CompScore)
        {
            System.out.println("Match is Draw");
        }
        else
        {
            System.out.println("Computer Won the Match");
        }
        System.out.println();
    }
}