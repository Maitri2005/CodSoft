import java.util.Random;
import java.util.Scanner;

class GameMethods{
    static int randomNoGenerator(){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
    static void guessNo(int generatedNo){
        Scanner sc = new Scanner(System.in);
        int countAttempts = 0;
        int userEnnterno=0;
        System.out.println("HEY BUDDY WELCOME TO NUMBER GUESSING GAME");
        System.out.println("ENTER YOUR GUESS");
        userEnnterno=sc.nextInt();
        while (countAttempts<3) {
            
            if(userEnnterno==generatedNo){
                System.out.println("GOOD JOB YOU GUESS THE CORRECT NO");
                
            }
            else if(userEnnterno>generatedNo){
                System.out.println("HEY BUDDY SORRY ENTER SMALLER NO");
                userEnnterno=sc.nextInt();
            }
            else{
                System.out.println("HEY BUDDY SORRY ENTER LARGER NO");
                userEnnterno=sc.nextInt();
            }
            countAttempts++;
        }
        System.out.println("THE NO IS " +generatedNo);
    }
}
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String startGame;
        System.out.println("HELLO WRITE YES FOR PLAY OR NO FOR EXIT");
        startGame = sc.nextLine();
        while (startGame.equals("YES")) {
            GameMethods.guessNo(GameMethods.randomNoGenerator());
            System.out.println("YES FOR PLAY OR NO FOR EXIT");
            startGame = sc.nextLine();
        }
        if(startGame.equals("NO")){
            System.out.println("THANKS FOR PLAY");
        }
    }
}
