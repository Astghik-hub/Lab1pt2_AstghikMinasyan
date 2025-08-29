/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1pt2_astghikminasyan;

/**
 *
 * @author 2466920
 */
public class GradedActivity {
    private double score;

    /**
     * Set the score
     * @param score the input score to set
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * Get the score
     * @return the corresponding score
     */
    public double getScore() {
        return score;
    }
    
    /**
     * Get the grade
     * @return the corresponding letter grade
     */
    public char getGrade() {
        char letterGrade;
        
        // Point the scores to a letter grade
        if (score >=90) {
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
