// Guess the Number, Using OOPs
import java.util.Scanner;
import java.util.Random;

class Game
{
    private int Guesses, RandNum, GuessNum;
    
    Game()
    {
        Random rand = new Random();
        this.RandNum = rand.nextInt(100);
    }

    public void TakeInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nGuess the Number : ");
        GuessNum = sc.nextInt();
    }

    public boolean isCorrectNum()
    {
        if(GuessNum == RandNum)
        {
            System.out.println("Perfect Guess...");
            return true;
        }
        else if(GuessNum < RandNum)
        {
            System.out.println(GuessNum + " is Less Than the Number");
        }
        else
        {
            System.out.println(GuessNum + " is Greater Than the Number");
        }
        return false;
    }

    public void setGuesses(int n)
    {
        Guesses = n;
    }

    public int getGuesses()
    {
        return Guesses;
    }
}


public class GuessNumber
{
    public static void main(String[] args)
    {
        int numOfGuess = 0;
        Game guessGame = new Game();
        do
        {
            guessGame.TakeInput();
            guessGame.setGuesses(++numOfGuess);
            // guessGame.isCorrectNum();
        }
        while(guessGame.isCorrectNum() == false);
        System.out.println("You took " + guessGame.getGuesses() + " Guesses\n");
    }
}
