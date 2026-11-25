package java_3_advance.quiz_console_app;

public class Main {
    public static void main(String[] args) {
        QuestionService service = new QuestionService();

        service.playQuiz();
        service.displayResult();
    }
}
