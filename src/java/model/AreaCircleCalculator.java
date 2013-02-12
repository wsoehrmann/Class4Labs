package model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wesley
 */
public class AreaCircleCalculator {

    private Double PI = 3.14159265359;
    private double radius;

    public Double getPI() {
        return PI;
    }

    public void setPI(Double PI) {
        this.PI = PI;
    }

    public double getradius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = Double.valueOf(radius);
    }
   public double getArea() {
       return PI * (radius * radius);
        
    }
}
