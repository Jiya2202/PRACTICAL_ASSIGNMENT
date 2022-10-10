/*AIM:Design an interface named Colorable with a void method named howToColor(). 
Every class of a colorable object must implement the Colorable interface. Design a 
class named Square that extends GeometricObject and implements Colorable. 
Implement howToColor to display the message Color all four sides. The Square
class contains a data field side with getter and setter methods, and a constructor for 
constructing a Square with a specified side. The Square class has a private double 
data field named side with its getter and setter methods. It has a no-arg constructor to 
create a Square with side 0, and another constructor that creates a Square with the 
specified side */
public class Square extends GeometricObject implements Colorable{

    private double side;
    
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public Square() {
        side = 0;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Square: side = " + side;
    }

    public void print() {
        System.out.println("Perimeter of Square: " + getPerimeter());
        System.out.println("Area of Square: " + getArea());
    }
    
}
