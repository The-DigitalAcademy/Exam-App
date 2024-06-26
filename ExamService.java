import java.util.Scanner;

public class ExamService implements Quiz {

    Exam[] questions = new Exam[5];

    public ExamService() {
        String[] answers_0 = { "short", "long", "long double", "boolean" };
        questions[0] = new Exam("Which of the following is NOT a java primitive type?", answers_0, "long double");

        String[] answer_1 = { "Syntax error", "Fault", "Semantic error", "Exception" };
        questions[1] = new Exam("A condition that is caused by run-time error in a computer program is known as : ",
                answer_1, "Exception");

        String[] answers_2 = { "The throw keyword", "The function that caused the error", "The catch block",
                "An object of the exception class", };
        questions[2] = new Exam("Additional information sent when an exception is thrown may be placed in : ",
                answers_2, "The catch block");

        String[] answers_3 = { "Java keywords cannot be used as variable names", "All of the options",
                "Variable names are case-sensitive", "The first character must be a letter" };
        questions[3] = new Exam("Which of the following are rules to declare variables in Java?", answers_3,
                "all of the options");

        String[] answers_4 = { "Execute a java program", "Debug a java program", "interpret a java program",
                "Compile a java program" };
        questions[4] = new Exam("What is the use of 'javac' command?", answers_4, "Compile a java program");
    }

    public void quiz() {

        int score = 0;

        System.out.println("==========>");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q " + (1 + i) + ") " + this.questions[i].getQuestion());

            showOptions(questions[i]);

            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            String strAnswer = answer.toLowerCase();

            if (strAnswer.equals(questions[i].getAnswer().toLowerCase())) {
                score++;
            }

            System.out.println("");
        }

        System.out.println("===> RESULTS: " + score + "/ " + questions.length);

    }

    void showOptions(Exam questions) {
        for (int i = 0; i < questions.getOptions().length; i++) {
            System.out.println(questions.getOptions()[i]);
        }
    }

}
