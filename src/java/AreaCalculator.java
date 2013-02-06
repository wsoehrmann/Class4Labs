/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wesley
 */
public class AreaCalculator {

  private  double length;
  private  double width;
  

    public double getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = Double.valueOf(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = Double.valueOf(width);
    }

    public double getArea() {
       return length * width;
        
    }

}
