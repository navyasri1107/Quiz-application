import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Questions and answers
        String[] questions = {
            "1. What is the capital of France?",
            "2. Which programming language is known as 'Write Once, Run Anywhere'?",
            "3. What is the largest planet in our solar system?"
        };
        
        String[][] options = {
            {"a) Paris", "b) London", "c) Berlin", "d) Madrid"},
            {"a) C", "b) Java", "c) Python", "d) JavaScript"},
            {"a) Earth", "b) Mars", "c) Jupiter", "d) Saturn"}
        };
        
        String[] correctAnswers = {"a", "b", "c"};
        
        int score = 0;

        // Start the quiz
        System.out.println("Welcome to the Quiz!");
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (a, b, c, d): ");
            String userAnswer = scanner.nextLine();
            
            // Check if the answer is correct
            if (userAnswer.equalsIgnoreCase(correctAnswers[i])) {
                score++;
            }
        }

        // Print score
        System.out.println("\nQuiz finished!");
        System.out.println("Your score: " + score + "/" + questions.length);
        
        scanner.close();
    }
}
