package Projects.TicTacToe;

import java.util.ArrayList;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args){
        ArrayList<game> games = new ArrayList<game>();
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Play");
        menu.add("Quit");
        String[] playList = {"1. 1v1", "2. Easy AI", "3. Normal AI", "4. Hard AI"};
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
                System.out.print("\n");
                for(int i = 0; i < playList.length; i++){
                    System.out.println(playList[i]);
                }
                System.out.println("\n");
                int toPlay = scan.nextInt();
                if(toPlay == 1){
                    games.add(new game());
                    while(!games.get(counter).check()){
                        System.out.println(games.get(counter).getBoard());
                        System.out.println(games.get(counter).getSymbol() + "'s turn");
                        games.get(counter).turn(games.get(counter).input());
                    }
                    System.out.println(games.get(counter).getWinner() + " wins!");
                    if(counter == 0){
                        menu.add(1, "Stats");
                    }
                    counter++;
                }
                if(toPlay == 2){
                    games.add(new aigame());
                    while(!games.get(counter).check()){
                        System.out.println(games.get(counter).getBoard());
                        System.out.println(games.get(counter).getSymbol() + "'s turn\n");
                        games.get(counter).turn(games.get(counter).input());
                    }
                    System.out.println(games.get(counter).getWinner() + " wins!");
                    if(counter == 0){
                        menu.add(1, "Stats");
                    }
                    counter++;
                }
                if(toPlay == 3){

                }
                if(toPlay == 4){

                }
            }
            if(answer == menu.size()){
                play = false;
            }else if(answer == 2){
                int access;
                do{
                    for(int i = 1; i <= games.size(); i++){
                        System.out.println(i + ". Game " + (i));
                    }
                    System.out.println((games.size()+1) + ". Back");
                    System.out.println("Which game do you want to access?");
                   access = scan.nextInt();
                   while(access < 1 || access > games.size()+1){
                        System.out.println("Invalid input. Try Again.");
                        access = scan.nextInt();
                   }
                   if(access != games.size()+1){
                        System.out.println(games.get(access-1));
                   }
                }while(access != games.size()+1);
            }
        }
        scan.close();
    }
}