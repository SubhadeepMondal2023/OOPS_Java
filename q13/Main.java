// Write a program to implement inner class
package q13;

abstract class Inner{
    abstract public void f();
}
class Outer{
    Inner in;

    // Constructor of Outer class that initializes the anonymous inner class
    public Outer(){
        this.in = new Inner() {
            public void f(){
                System.out.println("inner class");
            }
        };
    }

    // Method to create a method-local inner class extending Inner
    public void createInnerClass(){
        class MethodInnerClass extends Inner{
            public void f(){
                System.out.println("method inner class");
            }
        }
        MethodInnerClass mic = new MethodInnerClass();
        mic.f();
    }
}
public class Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.in.f();

        //test the method-local inner class
        out.createInnerClass();
    }
}
