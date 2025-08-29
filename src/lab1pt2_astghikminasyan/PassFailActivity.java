/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1pt2_astghikminasyan;

/**
 *
 * @author 2466920
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;

    /**
     * Constructor
     * @param minPassingScore the minimum passing grade for the activity 
     */
    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }
    
    /**
     * Override getter for grade
     * @return the final grade 'P' or 'F' 
     */
    @Override
    public char getGrade() {
        char passFail;
        
        // Determine if passFail is 'P' or 'F'
        if (super.getScore() > minPassingScore) {
            passFail = 'P';
        } else passFail = 'F';
        
        return passFail;
    }
}
