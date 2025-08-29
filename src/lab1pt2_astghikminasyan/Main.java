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
        // Set varables
        int questions = 100;
        int missed = 25;
        
        // FIRST OUTPUT
        // Create a FinalExam instance
        FinalExam f1 = new FinalExam(questions, missed);
        
        // Check first output
        System.out.printf("How many questions on the final exam? %d%n", questions);
        System.out.printf("How many questions did the student miss? %d%n", f1.getNumMissed());
        System.out.printf("Each question counts %.1f points%n", f1.getPointsEach());
        System.out.printf("The exam score is %.1f%n", f1.getScore());
        System.out.printf("The exam grade is %c%n", f1.getGrade());
        System.out.println("");
        
        // SECOND OUTPUT
        // Create a PassFailExam instancecheck the output
        double minPassing = 60;
        PassFailExam pfe1 = new PassFailExam(questions, missed, minPassing);
        
        // Check second output
        System.out.printf("How many questions on the final exam? %d%n", questions);
        System.out.printf("How many questions did the student miss? %d%n", pfe1.getNumMissed());
        System.out.printf("What is the minimum passing score? %.0f%n", minPassing);
        System.out.printf("Each question counts %.1f points%n", pfe1.getPointsEach());
        System.out.printf("The exam score is %.1f%n", pfe1.getScore());
        System.out.printf("The exam grade is %c%n", pfe1.getGrade());
        System.out.println("");
        
        // THIRD OUTPUT
        // Set variables
        double grammarPoints = 25;
        double spellingPoints = 18;
        double lengthPoints = 20;
        double contentPoints = 25;
        
        // Create an Essay instance to check the output
        Essay e1 = new Essay();
        e1.setGrammar(grammarPoints);
        e1.setSpelling(spellingPoints);
        e1.setCorrectLength(lengthPoints);
        e1.setContent(contentPoints);
        e1.setScore(grammarPoints, spellingPoints, lengthPoints, contentPoints);
        
        // Check third output
        System.out.println("Term paper:");
        System.out.printf("Grammar points: %.1f%n", e1.getGrammar());
        System.out.printf("Spelling points: %.1f%n", e1.getSpelling());
        System.out.printf("Length points: %.1f%n", e1.getCorrectLength());
        System.out.printf("Content points: %.1f%n", e1.getContent());
        System.out.printf("Total points: %.1f%n", e1.getScore());
        System.out.printf("Grade: %c%n", e1.getGrade());
        System.out.println("");
        
        // FOURTH OUTPUT
        // Create GradedActivity subclasses and iniate them
        double minPassing2 = 70;
        GradedActivity g2 = new GradedActivity();
        g2.setScore(85);
        PassFailExam pfe2 = new PassFailExam(100, 15, minPassing);
        Essay e2 = new Essay();
        e2.setScore(20, 20, 20, 20);
        FinalExam fe2 = new FinalExam(100, 20);
        
        // Create a CourseGrades instance
        CourseGrades cg = new CourseGrades();
        cg.setLab(g2);
        cg.setPassFailExam(pfe2);
        cg.setEssay(e2);
        cg.setFinalExam(fe2);
        System.out.println(cg.toString());
    }
}
