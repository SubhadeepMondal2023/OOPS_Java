// Write down the factorial function(take input using scanner).
package q3;

import java.util.*;

public class Factorial {
    public static int fact(int a){
        int result = 1;
        for(int i=1; i<=a; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = fact(a);
        System.out.println("The factorial of " + a + " is: " + result);
        sc.close();
    }
}
