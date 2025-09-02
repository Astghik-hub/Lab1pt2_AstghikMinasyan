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
public class CourseGrades implements Analyzable {
    GradedActivity[] grades;
    final int NUM_GRADES = 4;

    /**
     * Constructor
     */
    public CourseGrades() {
        this.grades = new GradedActivity[NUM_GRADES];
    }

    /**
     * Set a GradedActivity object as element 0 of grades
     *
     * @param aLab the input GradedActivity object
     */
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }

    /**
     * Set a PassFailExam object as element 1 of grades
     *
     * @param aPassFailExam the input PassFailExam object
     */
    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }

    /**
     * Set an Essay object as element 2 of grades
     *
     * @param anEssay the input Essay object
     */
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }

    /**
     * Set a FinalExam object as element 3 of grades
     *
     * @param aFinalExam the input FinalExam object
     */
    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }

    /**
     * Create String for student's results
     *
     * @return formatted string containing the numeric scores and corresponding
     * letter grades for each element in the grades array
     */
    @Override
    public String toString() {
        String str = "";

        str += String.format("Lab Score: %.1f %12s: %c%n", grades[0].getScore(), "Grade", grades[0].getGrade());
        str += String.format("Pass/Fail Exam Score: %.1f %10s: %c%n", grades[1].getScore(), "Grade", grades[1].getGrade());
        str += String.format("Essay Score: %.1f %10s: %c%n", grades[2].getScore(), "Grade", grades[2].getGrade());
        str += String.format("Final Exam Score: %.1f %s: %c", grades[3].getScore(), "Grade", grades[3].getGrade());

        return str;
    }

    @Override
    public double getAverage() {
        double sum = 0;

        for (GradedActivity grade : grades) {
            sum += grade.getScore();
        }

        return sum / grades.length;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity highest = grades[0];

        for (GradedActivity grade : grades) {
            if (grade != null && grade.getScore() > highest.getScore()) {
                highest = grade;
            }
        }

        return highest;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity lowest = grades[0];

        for (GradedActivity grade : grades) {
            if (grade != null && grade.getScore() < lowest.getScore()) {
                lowest = grade;
            }
        }

        return lowest;
    }
}
