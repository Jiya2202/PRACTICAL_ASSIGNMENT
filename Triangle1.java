/*AiM:Design a class named Triangle that extends GeometricObject. 
•   The class contains: Three double data fields named side1, side2, and side3 
•   with default values 1.0 to denote three sides of a triangle. 
•   A no-arg constructor that creates a default triangle. 
•   A constructor that creates a triangle with the specified side1, side2, and side3.
•   The accessor methods for all three data fields.
•   A method named getArea() that returns the area of this triangle.
•   A method named getPerimeter() that returns the perimeter of this triangle.
•   A method named toString() that returns a string description for the triangle. 
•   return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + 
•   side3
*/
import java.math.*;

public class Triangle1 extends GeometricObject{

    private double side1;
    private double side2;
    private double side3;
    
    public Triangle1() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle1(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return (side1+side2+side3);
    }

    @Override
    public double getArea() {
        double s = (side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
    
    public void print() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    
}
