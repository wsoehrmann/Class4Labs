package model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wesley
 */
public class ThirdLegOfTriangleCalculator {
private    double firstleg;
private    double secondleg;
  
    public double getFirstleg() {
        return firstleg;
    }

    public void setFirstleg(String firstleg) {
       this.firstleg = Double.valueOf(firstleg);
    }

    public double getSecondleg() {
        return secondleg;
    }

    public void setSecondleg(String secondleg) {
       this.secondleg = Double.valueOf(secondleg);
    }

    public double getThirdleg() {
        return Math.sqrt(firstleg * firstleg)+ (secondleg * secondleg);
       
    }

    
    
}
