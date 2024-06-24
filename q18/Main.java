// Write a program to demonstrate compile time polymorphism.
package q18;

class Add{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    String add(String a, String b){
        return a+b;
    }
}
public class Main {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.add(4, 5));
        System.out.println(a.add(4.0, 5.0));
        System.out.println(a.add("Subha", "Deep"));
    }
}
