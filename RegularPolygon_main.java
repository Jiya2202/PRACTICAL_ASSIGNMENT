/*In an n-sided regular polygon, all sides have the same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). Design a class named RegularPolygon that contains: 
•   A private int data field named n that defines the number of sides in the polygon with default value 3.
•   A private double data field named side that stores the length of the side with default value 1.
•   A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
•   A private double data field named y that defines the coordinate of the polygon’s center with default value 0.
•   A no-arg constructor that creates a regular polygon with default values.  A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0).
•   A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
•   The accessor and mutator methods for all data fields.
•   The method getPerimeter() that returns the perimeter of the polygon. 
•   The method getArea() that returns the area of the polygon. The formula for computing the area of a regular polygon is:
 */
public class RegularPolygon_main {

    public static void main(String[] args) {
        
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(5, 20);
        RegularPolygon p3 = new RegularPolygon(10, 500, 6, 10);
        
        System.out.println("Polygon 1");
        p1.print();
        System.out.println("Polygon 2");
        p2.print();
        System.out.println("Polygon 3");
        p3.print();
        
    }

}
