package Projects.TicTacToe;

import java.util.ArrayList;
public class aigame extends game{
    private ArrayList<Integer> vinput = new ArrayList<Integer>();
    public aigame(){
        super();
        for(int i = 1; i < 10; i++){
            vinput.add(i);
        }
    }
    public int input(){
        return super.input();
    }
    public int eainput(){
        int input = vinput.get((int) (Math.random()*vinput.size()));
        return input;
    }
    public int nainput(int c){
        if(c != 0){
            return c;
        }
        return eainput();
    }
    public int winblockCheck(String[][] g){
        for(int i = 0;i < g.length; i++){
            if(g[i][0].equals(g[i][1]) || g[i][0].equals(g[i][2]) || g[i][1].equals(g[i][2])){
                for(int j = 0; j < g[i].length; j++){
                    if(g[i][j] != "x" && g[i][j] != "o"){
                        return ((i*3)+(j+1));
                    }
                }
            }
        }
        for(int i = 0; i < g[0].length; i++){
            if(g[0][i].equals(g[1][i]) || g[0][i].equals(g[2][i]) || g[1][i].equals(g[2][i])){
                for(int j = 0; j < g.length; j++){
                    if(g[j][i] != "x" && g[j][i] != "o"){
                        return ((j*3)+(i+1));
                    }
                }
            }
        }
        if(g[0][0].equals(g[1][1]) || g[0][0].equals(g[2][2]) || g[1][1].equals(g[2][2])){
            for(int i = 0; i < 3; i++){
                if(g[i][i] != "x" && g[i][i] != "o"){
                        return ((i*3)+(i+1));
                }
            }
        }
        if(g[0][2].equals(g[1][1]) || g[0][2].equals(g[2][0]) || g[1][1].equals(g[2][0])){
            for(int i = 0; i < 3; i++){
                if(g[i][2-i] != "x" && g[i][2-i] != "o"){
                        return ((i*3)+((2-i)+1));
                }
            }
        }
        return 0;
    }
    public void turn(int input){
        super.turn(input);
        vinput.remove(vinput.indexOf(input));
    }
    public void play(int c){
        while(!super.check()){
            System.out.println(super.getBoard());
            System.out.println(super.getSymbol() + "'s turn\n");
            turn(input());
            if(super.check()){
                break;
            }
            System.out.println(super.getBoard());
            System.out.println(super.getSymbolList()[super.getStart()]+ "'s turn\n");
            if(c == 2){
                turn(eainput());
            }
            if(c == 3){
                turn(nainput(winblockCheck(super.getGrid())));
            }
        }
        System.out.println(getWinner() + " wins!");
    }
}