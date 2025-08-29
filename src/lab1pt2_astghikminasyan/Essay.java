/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1pt2_astghikminasyan;

/**
 *
 * @author 2466920
 */
public class Essay extends GradedActivity {
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    /**
     * Setter for the score in the superclass
     * @param grammar the amount of grammar points earned by the student
     * @param spelling the amount of spelling points earned by the student
     * @param correctLength the amount of length points earned by the student
     * @param content the amount of content points earned by the student
     */
    public void setScore (double grammar, double spelling, double correctLength, double content) {
        double score = grammar + spelling + correctLength + content;
        super.setScore(score);
    }
    
    /**
     * Setter for grammar
     * @param grammar the amount of grammar points earned by the student
     */
    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    /**
     * Setter for spelling
     * @param spelling the amount of spelling points earned by the student
     */
    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    /**
     * Setter for correctLength
     * @param correctLength the amount of length points earned by the student
     */
    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    /**
     * Setter for content
     * @param content the amount of content points earned by the student
     */
    public void setContent(double content) {
        this.content = content;
    }

    /**
     * Getter for grammar
     * @return the grammar parameter
     */
    public double getGrammar() {
        return grammar;
    }

    /**
     * Getter for spelling
     * @return the spelling parameter
     */
    public double getSpelling() {
        return spelling;
    }

    /**
     * Getter for correctLength
     * @return the correctLength parameter
     */
    public double getCorrectLength() {
        return correctLength;
    }
    
    /**
     * Getter for score in the superclass
     * @return the score parameter
     */
    @Override
    public double getScore() {
        return super.getScore();
    }
}
