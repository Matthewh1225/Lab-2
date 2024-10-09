import java.util.*;

public class Problem2 {
    public static void main(String[] args){ 
        guessingGame();
     } 
    public static void guessingGame(){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int userGuess;
        int numToGuess = r.nextInt(10,91);
        int count = 0;
        while(true){
            System.out.println("Please Guess a number between 10-90: ");
            count+=1;
            userGuess = s.nextInt();
            if (userGuess < numToGuess){
                System.out.println("Wrong answer, go higher! ");
            }
            else if (userGuess > numToGuess){
                System.out.println("Wrong answer, go lower! ");
            }
            else{
                System.out.printf("Correct! It took you " + count + " guesses");
                s.close();
                break;
            }
        }
    }   
}
    

