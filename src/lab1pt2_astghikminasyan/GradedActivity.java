/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1pt2_astghikminasyan;

/**
 *
 * @author Astghik Minasyan
 * Lab_01_pt2: Review OOP
 * 09/01/2025
 */
public class GradedActivity {
    private double score;

    /**
     * Setter for score
     *
     * @param score the input double to set as score
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * Getter for score
     *
     * @return the score parameter
     */
    public double getScore() {
        return score;
    }

    /**
     * Getter for grade
     *
     * @return the corresponding letter grade
     */
    public char getGrade() {
        char letterGrade;

        // Point the scores to a letter grade
        if (score >= 90) {
            letterGrade = 'A';
        } else if (score >= 80) {
            letterGrade = 'B';
        } else if (score >= 70) {
            letterGrade = 'C';
        } else if (score >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        return letterGrade;
    }
}
