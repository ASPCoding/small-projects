package Projects.TicTacToe;

import java.util.ArrayList;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args){
        ArrayList<game> games = new ArrayList<game>();
        Scanner scan = new Scanner(System.in);
        boolean play = true;
        int counter = 0;
        while(play){
            System.out.println("Tic-Tac-Toe \n \n 1. Play \n 2. Quit");
            int answer = scan.nextInt();
            while(answer != 1 && answer != 2){
                System.out.println("Wrong input, try again");
                answer = scan.nextInt();
            }
            if(answer == 1){
                games.add(new game());
                while(!games.get(counter).check()){
                    System.out.println(games.get(counter).getBoard());
                    System.out.println(games.get(counter).getSymbol() + "'s turn");
                    games.get(counter).turn();
                }
                System.out.println(games.get(counter).getWinner() + " wins!");
                counter++;
            }
            if(answer == 2){
                play = false;
            }
        }
        scan.close();
    }
}