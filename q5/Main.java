// Write a Java program to implement a class "Bird" that extends another class "Animal", also using interface
package q5;
interface Flyable{
    void fly();
}
abstract class Animal{
    String name;
    String color;
    Animal(String name, String color){
        this.name = name;
        this.color = color;
    }
    abstract void makeSound();
    abstract void color();
}
class Bird extends Animal implements Flyable{
    Bird(String name, String color){
        super(name, color);
    }
    @Override
    // only void makes method "default(pacakage-private)"
    void makeSound(){
        System.out.println(name + " chirps.");
    }
    @Override
    // must give public in case of implements
    public void fly(){
        System.out.println(name + " is flying");
    }
    @Override
    void color(){
        System.out.println(name + " is " + color);
    }
}
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Parrot", "Green");
        bird.makeSound();
        bird.fly();
        bird.color();
    }
}
