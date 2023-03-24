package AGadget;

import AGadget.Rock_Paper_Scissor_Game;
import java.util.Scanner;

public class Game extends GameItems {
    private Player_Game player;
    private Rock_Paper_Scissor_Game computer;
    private Choices player_choices;
    private Choices computer_choice;
    private Result result;
    private static int wins;
    private static int lose;
    private static int ties;
    public Game()
    {
        super();
        player = new Player_Game();
        computer = new Rock_Paper_Scissor_Game();
    }
    Scanner sc = new Scanner(System.in);
    public void display()
    {
        char quite = ' ';
        while (quite != 'N')
        {
            System.out.println("You want to Play Game, Press any Key & otherwise 'N' for Quite ");
            quite = sc.nextLine().toUpperCase().charAt(0);
            if(quite != 'N')
            {
                player_choices = player.getChoice();
                computer_choice = computer.getChoice();
            }
                result = getResult();
                display_Result();
                start();

        }
    }
    private void start()
    {
        if(result == Result.WIN)
        {
            wins++;
        }
        else if (result == Result.Lose)
        {
            lose++;
        }
        else
        {
            ties++;
        }
    }
    public void display_Start()
    {
        System.out.println("You have Played " +(wins + lose + ties));
        System.out.println("You have Won " +wins+ " times \n");
        System.out.println("You have Lose " +lose+ " times \n ");
        System.out.println("The Ties happened " +ties+ " times \n Thanks for Playing this Game.. \n Codder: ALi G@te$ ");
    }
    private void display_Result()
    {
        switch (result)
        {
            case WIN:
                System.out.println(player_choices + " Beats " + computer_choice +". Player Wins");
                break;
            case Lose:
                System.out.println(player_choices + " Loses to " + computer_choice +". Computer Wins");
                break;
            case Tie:
                System.out.println(player_choices + " Equals to " + computer_choice +". It's a Tie.");
                break;
        }
    }
    public Result getResult()
    {
        if(player_choices == computer_choice)
        {
            return Result.Tie;
        }
        switch (player_choices)
        {
            case Rock:
                /* When Player Choice Rock then Computer Choice Scissors, Player is Win Otherwise Computer is Win.*/
                return (computer_choice == Choices.Scissors ? Result.Win : Result.Lose);
            case Paper:
                /* When Player Choice Paper then Computer Choice Rock, Player is Win Otherwise Computer is Win.*/
                return (computer_choice == Choices.Rock ? Result.Win : Result.Lose);
            case Scissors:
                /* When Player Choice Scissors then Computer Choice Paper, Player is Win Otherwise Computer is Win.*/
                return (computer_choice == Choices.Paper ? Result.Win : Result.Lose);
        }
        // Result is lose Always
        return Result.Lose;
    }

}
