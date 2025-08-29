/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1pt2_astghikminasyan;

/**
 *
 * @author 2466920
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    /**
     * Constructor
     * @param questions the number of questions in the exam
     * @param missed the number of questions missed by the student
     * @param minPassing the minimum passing grade for the exam
     */
    public PassFailExam(int questions, int missed, double minPassing) {
        super(minPassing);
        this.numQuestions = questions;
        this.numMissed = missed;
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
