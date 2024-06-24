// Write a problem of constructor chaining. In the above problem, call one constructor from another constructor.
package q9;

class Parent{
    String name;
    // Constructor with no parameters
    public Parent(){
        // call the constructor with parameters
        this("P1"); // Default name
    }
    // constructor with parameters
    public Parent(String name){
        this.name = name;
    }
    public String display(){
        System.out.println("Name is " + this.name);
        return this.name;
    }
}
class Child extends Parent{
    Child(String name){
        super(name);
    }
}
public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child("C1");
        System.out.println(p1.display());
        System.out.println(c1.display());
    }
}
