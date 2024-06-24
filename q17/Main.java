// Q. Write a program to demonstrate
// upcasting-downcasting,
// runtime polymorphism
// and dynamic binding.

package q17;

interface A{
    void display();
}

class B implements A {
    public void display() {
        System.out.println("Message from B");
    }
}

class C extends B {
    public void display() {
        System.out.println("Message from C");
    }
}

public class Main {
  public static void main(String[] args) {
    // Upcasting: B and C objects to A type
    A obA1 = new B();
    A obA2 = new C();

    // Downcasting with instanceof chack,
    // otherwise throws 'ClassCastException'
    if(obA1 instanceof B){
        B obB = (B) (obA1);
        obB.display();
    }

    // Runtime polymorphism and dynamic binding
    obA1.display(); // should call B's display method
    obA2.display(); // should call C's display method

  }  
}
