// Write a program to show anonymous class.
// An anonymous class in Java is a type of inner class that does not have a name and is declared and instantiated all at once. Anonymous classes are typically used to instantiate objects with certain "one-off" functionality or behavior that isn't needed elsewhere in the code. 

package q14;
abstract class Animal{
    abstract void makeSound();
}
public class Main {
    public static void main(String[] args) {
        // Anonymous class extending the Animal abstract class
        Animal ob = new Animal(){
            void makeSound(){
                System.out.println("Roar!");
            }
        };

        // Calling the method of the anonymous class
        ob.makeSound();
    }
}
