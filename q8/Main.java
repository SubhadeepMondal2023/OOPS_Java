// Write a java program to demonstrate the use of a copy constructor.
package q8;
class Bike{
    int num;
    String model;
    Bike(){
        this.num = 125;
        this.model = "Pulsar";
    }
    // Copy constructor
    Bike(Bike b){
        this.num = b.num;
        this.model = b.model;
    }
    void display(){
        System.out.println("number: " + this.num + ", Model: " + this.model);
    }
}
public class Main {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike b2 = new Bike(b1);
        b1.display();
        b2.display();
    }
}
