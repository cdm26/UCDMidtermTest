/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucdmidtermtest;

/**
 *
 * @author cdm26
 */
public class GradeCalc {    
    private int testScore;
    private int curvedScore;

    public GradeCalc(int testScore) {
        this.testScore = testScore;
        
    }

    public GradeCalc() {
        this.testScore = 0;
        this.curvedScore = 0;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    public int getCurvedScore() {
        return curvedScore;
    }

    public int calcCurvedScore(){
        double tempScore = Math.sqrt(testScore);
        curvedScore = (int) Math.round(tempScore * 10);
        return curvedScore;
    }  
}

