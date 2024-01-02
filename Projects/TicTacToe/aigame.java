package Projects.TicTacToe;

import java.util.Scanner;
import java.util.ArrayList;
public class aigame extends game{
    private String[][] grid = {
        {"1", "2", "3"},
        {"4", "5", "6"},
        {"7", "8", "9"}
    };
    private String board;
    private int start;
    private String[] symbol = {"o","x"};
    private String winner = "";
    private ArrayList<Integer> vinput = new ArrayList<Integer>();
    public aigame(){
        super();
        for(int i = 0; i < 9; i++){
            vinput.add(i);
        }
    }
    public void turn(){
        Scanner scan = new Scanner(System.in);
        boolean validity = true;
        int input = scan.nextInt();
        do{
            if(input > 9 || input < 0 || grid[Math.floorDiv(input-1,3)][(input-1)%3] == symbol[(start-1)*-1] || grid[Math.floorDiv(input-1,3)][(input-1)%3] == symbol[(start)]){
                System.out.println("Invalid input, try again.");
                input = scan.nextInt();
                validity = false;
            }else{
                validity = true;
            }
        }while(!validity);
        vinput.remove(input-1);
        grid[Math.floorDiv(input-1,3)][(input-1)%3] = symbol[start];
        board = "   |   |   \n" + 
                " " + grid[0][0] + " | " + grid[0][1] + " | "+ grid[0][2] +" \n" +
                "   |   |   \n" + 
                "---+---+---\n" +
                "   |   |   \n" +
                " "+ grid[1][0] +" | "+ grid[1][1] +" | "+ grid[1][2] +" \n" +
                "   |   |   \n" +
                "---+---+---\n" +
                "   |   |   \n" +
                " "+ grid[2][0] +" | "+ grid[2][1] +" | "+ grid[2][2] +" \n" +
                "   |   |   \n" ;
        int eaimove = (int) Math.random()*vinput.size();
        grid[Math.floorDiv(vinput.get(eaimove)-1,3)][(vinput.get(eaimove)-1)%3] = symbol[(start-1)*-1];
        board = "   |   |   \n" + 
                " " + grid[0][0] + " | " + grid[0][1] + " | "+ grid[0][2] +" \n" +
                "   |   |   \n" + 
                "---+---+---\n" +
                "   |   |   \n" +
                " "+ grid[1][0] +" | "+ grid[1][1] +" | "+ grid[1][2] +" \n" +
                "   |   |   \n" +
                "---+---+---\n" +
                "   |   |   \n" +
                " "+ grid[2][0] +" | "+ grid[2][1] +" | "+ grid[2][2] +" \n" +
                "   |   |   \n" ;
    }
    public void hturn(){

    }
    public String getBoard(){
        return board;
    }
}
