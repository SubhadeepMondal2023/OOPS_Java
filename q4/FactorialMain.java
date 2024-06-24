// Q. Write down the factorial function( take input from command line for main())
package q4;
public class FactorialMain {
    public static int fact(int a){
        int result = 1;
        for(int i=1; i<=a; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        //Compile Time: java FactorialMain 4 
        // i.e. input is 4, given in command line
        int a = Integer.parseInt(args[0]);
        int result = fact(a); // a = 4, result = 24
        System.out.println("The factorial of " + a + " is: " + result);
    }
}
