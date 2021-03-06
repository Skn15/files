
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
     public class Rectangle extends GeometricShape {
         private double width;
         private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, boolean filled, String color, Date dateCrated) {
        super(filled, color, dateCrated);
        this.width = width;
        this.height = height;
    }
    

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
         
    public double getArea(){
        return this.width*this.height;
    }     

    public double getPerimeter(){
        return 2*(this.height+this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    
    
}
