package controller;

import model.QuizModel;
import view.QuizView;

public class QuizController {

    private QuizModel quizModel;
    private QuizView quizView;
    private int score;


    public QuizController(QuizModel quizModel, QuizView quizView) {
        this.quizModel = quizModel;
        this.quizView = quizView;
        this.score = 0;
    }

    public void startQuiz() {
        int totalQuestions = quizModel.getTotalQuestions();
        for (int i = 0; i < totalQuestions; i++) {
            
            String question = quizModel.getQuestion(i);
            String[] options = quizModel.getOptions(i);

        
            quizView.displayQuestion(question, options);

            String userAnswer = quizView.getUserAnswer();
            if (userAnswer.equals(quizModel.getCorrectAnswer(i))) {
                score++;
            }
        }
        quizView.displayScore(score, totalQuestions);
    }
}
