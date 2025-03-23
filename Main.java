import controller.QuizController;
import model.QuizModel;
import view.QuizView;

public class Main {
    public static void main(String[] args) {
        
        QuizModel quizModel = new QuizModel();
        QuizView quizView = new QuizView();

        QuizController quizController = new QuizController(quizModel, quizView);

      
        quizController.startQuiz();
    }
}
