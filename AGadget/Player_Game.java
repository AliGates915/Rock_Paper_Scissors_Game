package AGadget;

//import AGadget.GameItems.Choices; This is Optional
import java.util.Scanner;

public class Player_Game extends GameItems {
       Scanner sc;
        public Player_Game()
        {
            super();
            sc = new Scanner(System.in);
        }
        public AGadget.GameItems.Choices getChoice()
        {
            System.out.println("Please Enter Your Choice: R = Rock, P = Paper, S = Scissors");
            // User Enter Choice And Automatically converted into Upper_Case.
            char player_choice = sc.nextLine().toUpperCase().charAt(0);
            switch (player_choice)
            {
                case 'R':
                    return GameItems.Choices.Rock;
                case 'P':
                    return GameItems.Choices.Paper;
                case 'S':
                    return GameItems.Choices.Scissors;
            }
            System.out.println("Invalid Input!");
            return getChoice();
        }

}
