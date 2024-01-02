package Projects.TicTacToe;

import java.util.ArrayList;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args){
        ArrayList<game> games = new ArrayList<game>();
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Play");
        menu.add("Quit");
        Scanner scan = new Scanner(System.in);
        boolean play = true;
        int counter = 0;
        while(play){
            System.out.println("Tic-Tac-Toe \n");
            for(int i = 0; i < menu.size(); i++){
                System.out.println(i+1 + ". " + menu.get(i));
            }
            int answer = scan.nextInt();
            while(answer > menu.size() || answer < 1){
                System.out.println("Wrong input, try again");
                answer = scan.nextInt();
            }
            if(answer == 1){
                games.add(new aigame());
                while(!games.get(counter).check()){
                    System.out.println(games.get(counter).getBoard());
                    System.out.println(games.get(counter).getSymbol() + "'s turn");
                    games.get(counter).turn();
                }
                System.out.println(games.get(counter).getWinner() + " wins!");
                if(counter == 0){
                    menu.add("Stats");
                }
                counter++;
            }
            if(answer == menu.size()){
                play = false;
            }else if(answer == 2){
                for(int i = 0; i < games.size(); i++){
                    System.out.println("Game " + i+1);
                }
            }
        }
        scan.close();
    }
}