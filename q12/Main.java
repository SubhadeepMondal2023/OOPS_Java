// Q. Write a program to show use of final keyword with variable, methods and class.
// final -> Important for maintaining security and integrity, especially in large and complex systems.

package q12;

class Circle{
    final double pi = 3.14; // value fixed within class, Cannot be changed once assigned.
    private int radius;
    Circle(int radius){
        this.radius = radius;
    }
    double area(){
        return pi*radius*radius;
    }
    // A final method cannot be overridden by subclasses. This is useful when you want to make sure that the implementation of a method remains the same across all subclasses.
    final double perimeter(){
        return 2*pi*radius;
    }
}
/*
 final class Shape{
 }
 class Rectangle extends Shape{
 }

 The above will throw error because "cannot inherit from final class"
 A final class cannot be subclassed. This is useful when you want to make sure that a class's implementation is not altered through inheritance.
 */
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        double area = c.area();
        double perimeter = c.perimeter();
        System.out.println(area);
        System.out.println(perimeter);
    }
}
