/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1pt2_astghikminasyan;

/**
 *
 * @author 2466920
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int questions = 100;
        int missed = 25;
        // Create a FinalExam instance to check the output
        FinalExam f1 = new FinalExam(questions, missed);
        
        System.out.printf("How many questions on the final exam? %d%n", questions);
        System.out.printf("How many questions did the student miss? %d%n", f1.getNumMissed());
        System.out.printf("Each question counts %.1f points%n", f1.getPointsEach());
        System.out.printf("The exam score is %.1f%n", f1.getScore());
        System.out.printf("The exam grade is %c%n", f1.getGrade());
        System.out.println("");
        
        // Create a PassFailExam instance to check the output
        double minPassing = 60;
        PassFailExam pfe = new PassFailExam(questions, missed, minPassing);
        System.out.printf("How many questions on the final exam? %d%n", questions);
        System.out.printf("How many questions did the student miss? %d%n", pfe.getNumMissed());
        System.out.printf("What is the minimum passing score? %.0f%n", minPassing);
        System.out.printf("Each question counts %.1f points%n", pfe.getPointsEach());
        System.out.printf("The exam score is %.1f%n", pfe.getScore());
        System.out.printf("The exam grade is %c%n", pfe.getGrade());
        System.out.println("");
    }
}
