package model;

import java.util.ArrayList;
import java.util.List;

public class QuizModel {

    private List<String> questions;
    private List<String[]> options;
    private List<String> correctAnswers;

    public QuizModel() {
    
        questions = new ArrayList<>();
        options = new ArrayList<>();
        correctAnswers = new ArrayList<>();
        questions.add("What is the capital of France?");
        options.add(new String[]{"1. Paris", "2. London", "3. Berlin", "4. Madrid"});
        correctAnswers.add("1");

        questions.add("Which programming language is known as the 'mother of all languages'?");
        options.add(new String[]{"1. Java", "2. C", "3. Python", "4. C++"});
        correctAnswers.add("2");

        questions.add("What is the largest planet in our solar system?");
        options.add(new String[]{"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"});
        correctAnswers.add("3");
    }
    public int getTotalQuestions() {
        return questions.size();
    }
    public String getQuestion(int index) {
        return questions.get(index);
    }
    public String[] getOptions(int index) {
        return options.get(index);
    }
    public String getCorrectAnswer(int index) {
        return correctAnswers.get(index);
    }
}