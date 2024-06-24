// Write a program to show Null-Pointer Exception Handling.
package q19;

class A{
    void display(){
        System.out.println("Class A object called.");
    }
}
public class Main {
    public static void main(String[] args) {
        A object = null;
        String str = null;

        try{
            object.display();
        }catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block executed");
            System.out.println();
        }

        try{
            str.toUpperCase();
        }catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block executed");
            System.out.println();
        }
    }
}
