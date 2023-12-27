package Projects.TicTacToe;

import java.util.ArrayList;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args){
        ArrayList games = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean play = true;

        while(play){
            System.out.println("Tic-Tac-Toe \n \n 1. Play \n 2. Quit");
            int answer = scan.nextInt();
            while(answer != 1 && answer != 2){
                System.out.println("Wrong input, try again");
                answer = scan.nextInt();
            }
            if(answer == 1){
            String[][] grid = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
            };
            System.out.println( "   |   |   \n" + 
                                " " + grid[0][0] + " | " + grid[0][1] + " | "+ grid[0][2] +" \n" +
                                "   |   |   \n" + 
                                "---+---+---\n" +
                                "   |   |   \n" +
                                " "+ grid[1][0] +" | "+ grid[1][1] +" | "+ grid[1][2] +" \n" +
                                "   |   |   \n" +
                                "---+---+---\n" +
                                "   |   |   \n" +
                                " "+ grid[2][0] +" | "+ grid[2][1] +" | "+ grid[2][2] +" \n" +
                                "   |   |   \n" 
                               );
            }
            if(answer == 2){
                play = false;
            }
    }
    }
}
