import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) throws Exception{
        
        Scanner num = new Scanner(System.in);

        System.out.println("Enter a number.");

        int endnum = num.nextInt();

        num.close();

        for (int i = 1; i <= endnum; i++){
            if(i % 15 == 0){
                System.out.println("Fizzbuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}