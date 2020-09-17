package quizappb;
import java.util.Scanner;

/**
 *
 * @author John Word
 */
public class QuizAppB {

    public static void main(String[] args) {
        int score = 0;
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Hello!");
        System.out.println("What color is the sky?");
        String answer1 = kboard.nextLine();
        if (answer1.equals("blue")) {
            //give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("What planet are you living on?");
        }
        //Questions 2 through 5
        
        //Tell user their score
        
    }
    
}
