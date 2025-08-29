/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1pt2_astghikminasyan;

/**
 *
 * @author 2466920
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    /**
     * Constructor
     * @param questions the number of questions
     * @param missed the number of questions missed
     */
    public FinalExam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        
        pointsEach = 100 / questions;
        double numericScore = 100 - (missed * pointsEach);
        super.setScore(numericScore);
    }

    /**
     * Getter for pointsEach
     * @return the pointsEach parameter
     */
    public double getPointsEach() {
        return pointsEach;
    }

    /**
     * Getter for numMissed
     * @return the numMissed parameter
     */
    public int getNumMissed() {
        return numMissed;
    }
}
