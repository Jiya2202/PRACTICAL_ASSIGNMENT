// //Aim:-Define a class named ComparableSquare that extends Square and implements 
// Comparable. Implement the compareTo method to compare the Squares on the basis 
// of area. Write a ComparableSquare class to find the larger of two instances of 
// ComparableSquareobjects.
interface comparable
{
        //First of we create interface
        //here we make on default method for comparing square and ColorableSquare 
    default public void compare(double side1,double side2) {
        
        if (side1 == side2) {
            System.out.println();
            System.out.println("The Square and ColorableSquare is Same...");
        } else {
            System.out.println("The Square and ColorableSquare is NOT Same...");
        }
    }
}

class squre {
    //here we some make methods for get and print
    protected double side1;

    public double gets() {
        return side1;
    }

    public void sets(double side1) {
        this.side1 = side1;
    }

    public void area() {
        System.out.println("The area of square is : " + this.side1 * this.side1);
    }
}
class ComparableSquare extends squre implements comparable {
    protected double side2;

    public double gets2() {
        return side2;
    }

    public void sets2(double side2) {
        this.side2 = side2;
    }

    public void area1() {
        System.out.println();
      
        System.out.println("The area of Colorablesquare is : " + this.side2 * this.side2);
    }
}

public class Prac10 {
    //In a main function we call all the methods thorugh object
    public static void main(String[] args) {
    ComparableSquare t=new ComparableSquare();
    t.sets(12);
    t.gets();
    t.area();
    t.sets2(12);
    t.gets2();
    t.area1();
    t.compare(12,12);
    }
}
