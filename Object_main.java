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
public class Object_main {

    public static void main(String[] args) {
        
        Triangle1 t1 = new Triangle1();
        Triangle1 t2 = new Triangle1(5.3, 6.8, 9.9);
        
        System.out.println(t1.toString());
        t1.print();
        System.out.println();
        
        System.out.println(t2.toString());
        t2.toString();
        t2.print();
    }

}
