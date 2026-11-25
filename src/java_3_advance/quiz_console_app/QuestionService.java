package java_3_advance.quiz_console_app;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "Size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "Size of float", "2", "6", "4", "8", "4");
        questions[3] = new Question(4, "Size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "Size of short", "2", "6", "4", "8", "2");
    }

    public void playQuiz() {
        int i = 0;
        for (Question q: questions) {
            IO.println("Question No. " + q.getId() + ": " + q.getQuestion());
            IO.println("Option 1: " + q.getOpt1());
            IO.println("Option 2: " + q.getOpt2());
            IO.println("Option 3: " + q.getOpt3());
            IO.println("Option 4: " + q.getOpt4());
            IO.println("--------------------------------");
            IO.println("Enter your answer: ");
            Scanner scanner = new Scanner(System.in);
            selection[i++] = scanner.nextLine();
            IO.println("--------------------------------");
        }
        for (int j = 0; j < selection.length; j++) {
            String s = selection[j];
            IO.println("Your answer for Question No. " + (j+1) + " is: " + s + " | Correct answer is: " + questions[j].getAnswer());
        }
    }

    public void displayResult() {
        int scoreOfEachQuestion = 100 / questions.length;
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            String correctAnswer = question.getAnswer();
            String userAnswer = selection[i];

            if (correctAnswer.equals(userAnswer)) {
                score += scoreOfEachQuestion;
            }
        }

        IO.println("Your score is: " + score);
    }
}
