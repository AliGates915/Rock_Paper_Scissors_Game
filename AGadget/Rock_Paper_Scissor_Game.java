package AGadget;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game extends AGadget.GameItems {
    private Random rand;
    public Rock_Paper_Scissor_Game()
    {
        super();
        rand = new Random();
    }
    public AGadget.GameItems.Choices getChoice()
    {
        int choice = 1 + rand.nextInt(3);
        switch (choice)
        {
            case  1:
                return AGadget.GameItems.Choices.Rock;
            case  2:
                return AGadget.GameItems.Choices.Paper;
            case    3:
                return AGadget.GameItems.Choices.Scissors;
        }
        return null;
    }
    //This is Main

    public static void main(String[] args)
    {
        System.out.println("\n **********Welcome to in Rock || Paper || Scissor Game******** \n");
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        game.display();
        game.display_Start();

    }
}

