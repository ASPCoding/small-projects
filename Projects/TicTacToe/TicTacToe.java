package Projects.TicTacToe;

import java.util.ArrayList;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args){
        ArrayList<game> games = new ArrayList<game>();
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Play");
        menu.add("Quit");
        String[] playList = {"1. 1v1", "2. Easy AI", "3. Normal AI"};
        Scanner scan = new Scanner(System.in);
        boolean play = true;
        int counter = 0;
        
        while(play){
            System.out.println("Tic-Tac-Toe \n");
            for(int i = 0; i < menu.size(); i++){
                System.out.println(i+1 + ". " + menu.get(i));
            }
            System.out.println("\nWhat do you want to do?");
            int answer = scan.nextInt();
            while(answer > menu.size() || answer < 1){
                System.out.println("\nWrong input, try again");
                answer = scan.nextInt();
            }
            if(answer == 1){
                System.out.print("\n");
                for(int i = 0; i < playList.length; i++){
                    System.out.println(playList[i]);
                }
                System.out.println("\nWhat kind of game do you want to play?");
                int toPlay = scan.nextInt();
                while(toPlay < 1 || toPlay > playList.length){
                    System.out.println("Invalid input. Try Again.");
                    toPlay = scan.nextInt();
                }
                if(toPlay == 1){
                    games.add(new game());
                    games.get(counter).play(toPlay);
                    if(counter == 0){
                        menu.add(1, "Stats");
                    }
                    counter++;
                }
                else{
                    games.add(new aigame());
                    games.get(counter).play(toPlay);
                    if(counter == 0){
                        menu.add(1, "Stats");
                    }
                    counter++;
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
                    System.out.println("\nWhich game do you want to access?");
                   access = scan.nextInt();
                   while(access < 1 || access > games.size()+1){
                        System.out.println("\nInvalid input. Try Again.");
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