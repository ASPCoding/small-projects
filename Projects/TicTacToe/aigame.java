package Projects.TicTacToe;

import java.util.ArrayList;
public class aigame extends game{
    private ArrayList<Integer> vinput = new ArrayList<Integer>();
    public aigame(){
        super();
        for(int i = 0; i < 9; i++){
            vinput.add(i);
        }
    }
    public int input(){
        return super.input();
    }
    public int eainput(){
        int input = vinput.get((int)Math.random()*vinput.size());
        vinput.remove(input);
        return input;
    }
    public void turn(int input){
        super.turn(input);
        vinput.remove(vinput.indexOf(input));
        System.out.println(super.getSymbolList()[super.getStart()]+ "'s turn");
        super.turn(eainput());
        System.out.println(super.getBoard());
    }
    public void hainput(){

    }
}
