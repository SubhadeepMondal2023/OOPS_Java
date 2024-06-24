// Q. Prepare a user defined exception below-age-exception, when a person's age is below 18, it shows the exception.

package q20;
import java.util.Scanner;

class BelowAgeException extends Exception{
    // the contructor takes a string s as argument and passes it to the super class Exception and can be used to provide details about the exception when it is thrown.
    public BelowAgeException(String s){
        super(s);
    }
}
public class Main {
    static void checkAge(int age) throws BelowAgeException{
        if(age < 18) throw new BelowAgeException("Below 18");
        else System.out.println("Valid Age");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = sc.nextInt();
        try{
            checkAge(age);
        }catch(BelowAgeException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Check complete.");
        }
    }
}
