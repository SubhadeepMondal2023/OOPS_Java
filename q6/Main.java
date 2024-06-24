// Write a java code to make a calculator using inheritance,also in strings (add & sub);

package q6;
import java.util.Scanner;
abstract class Calculator{
    abstract public int add(int a, int b);
    abstract public String add(String a, String b);
    abstract public int sub(int a, int b);
    abstract public String sub(String a, String b);
    abstract public int mul(int a, int b);
    abstract public double div(double a, double b);
    abstract public float mul(float a, float b);
}
class Solution extends Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public String add(String a, String b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public String sub(String a, String b){
        StringBuilder res = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if(b.indexOf(c) == -1){
                res.append(c);
            }
        }
        return res.toString();
    }
    public int mul(int a, int b){
        return a*b;
    }
    public float mul(float a, float b){
        return a*b;
    }
    public double div(double a, double b){
        return a/b;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Solution s = new Solution();

        System.out.println("addition: " + s.add(x, y));
        System.out.println("subtraction: " + s.sub(x, y));
        System.out.println("multiplication: " + s.mul(x, y));
        System.out.println("divison: " + s.div(x, y));

        System.out.println("Enter two strings: ");
        String p = sc.next();
        String q = sc.next();
        
        System.out.println("Addition o/p: " + s.add(p, q));
        System.out.println("Subtraction o/p: " + s.sub(p, q));
        sc.close();
    }
}