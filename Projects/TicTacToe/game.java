package Projects.TicTacToe;
import java.util.Scanner;


public class game {
    private String[][] grid = {
        {"1", "2", "3"},
        {"4", "5", "6"},
        {"7", "8", "9"}
    };
    private String board;
    private int start;
    private String[] symbol = {"o","x"};
    private String winner = "";
    public game(){
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
        start = (int) (Math.random()*2);
        }
    public int input(){
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
        return input;
    }
    public void turn(int input){
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
        start = (start-1)*-1;
    }
    public boolean check(){
        for(int i = 0;i < grid.length; i++){
            if(grid[i][0].equals(grid[i][1]) && grid[i][0].equals(grid[i][2])){
                winner = grid[i][0];
                return true;
            }
        }
        for(int i = 0; i < grid[0].length; i++){
            if(grid[0][i].equals(grid[1][i]) && grid[0][i].equals(grid[2][i])){
                winner = grid[0][1];
                return true;
            }
        }
        if(grid[0][0].equals(grid[1][1])&&grid[0][0].equals(grid[2][2])){
            winner = grid[0][0];
            return true;
        }
        if(grid[0][2].equals(grid[1][1])&&grid[0][2].equals(grid[2][0])){
            winner = grid[0][2];
            return true;
        }

        return false;
    }
    public String getBoard(){
        return board;
    }
    public String getSymbol(){
        return symbol[start];
    }
    public String getWinner(){
        return winner;
    }
    public String[][] getGrid(){
        return grid;
    }
    public int getStart(){
        return start;
    }
    public String[] getSymbolList(){
        return symbol;
    }
}
