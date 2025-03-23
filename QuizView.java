package view;

import java.util.Scanner;

public class QuizView {

  
    public void displayQuestion(String question, String[] options) {
        System.out.println(question);
        for (String option : options) {
            System.out.println(option);
        }
    }

    
    public String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your answer (1, 2, 3, or 4): ");
        return scanner.nextLine();
    }

   
    public void displayScore(int score, int totalQuestions) {
        System.out.println("Your final score is: " + score + "/" + totalQuestions);
    }
}
