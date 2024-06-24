// Write down the "COUNTER PROBLEM" and without creating object,
// call a method variable,
// static method,
// static block problem.

package q10;

class Solution{
    // static method variable can be called without creating an object.
    static int i =3;

    Solution(){
        i++;
        System.out.println(i);
    }

    // the below "static" method, accessible without an instance of the class.
    static void square(){
        System.out.println(i*i);
    }

    // A static block is a block of code that gets executed when the class is first loaded into the memory.
    static{
        System.out.println("Static called.");
    }
}
public class Main {
    public static void main(String[] args) {
        Solution.square();
        Solution obj1 = new Solution();
        Solution.square();
        Solution obj2 = new Solution();
        Solution.square();
    }
}