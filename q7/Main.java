// Write a java program to demonstrate the constructor overloading
package q7;
class Bike{
    int i;
    String name;

    // Default constructor
    Bike(){
        this.i = 35;
        this.name = "Honda";
    }

    // Method Overloading
    // Parameterised Constructor
    Bike(int i){
        this.i = i;
    }
    Bike(String name){
        this.name = name;
    }
    Bike(int i, String name){
        this.i = i;
        this.name = name;
    }
    void display(){
        System.out.println("Number: " + i + ", Name: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike b2 = new Bike(125);
        Bike b3 = new Bike("Pulsar");
        Bike b4 = new Bike(350, "Royal Enfield Continental GT");
        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
