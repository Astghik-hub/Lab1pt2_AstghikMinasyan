/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab1pt2_astghikminasyan;

/**
 *
 * @author Astghik Minasyan
 * Lab_01_pt2: Review OOP
 * 09/01/2025
 */
public interface Analyzable {
    /**
     * Average the numeric scores stored in the grades array
     *
     * @return the average of the scores
     */
    public double getAverage();

    /**
     * Find the element in the grades array with the highest numeric score
     *
     * @return the element with the highest score
     */
    public GradedActivity getHighest();

    /**
     * Find the element in the grades array with the lowest numeric score
     *
     * @return the element with the lowest score
     */
    public GradedActivity getLowest();
}
