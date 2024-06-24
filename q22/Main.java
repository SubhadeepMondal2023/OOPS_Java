// Write a java program to concatenate two strings and find out the indices of capital letters.
package q22;

import java.util.Scanner;
class StrFunc{
    static String concat(String s1, String s2){
        String res = s1.concat(s2);
        return res;
    }
    static void findCapital(String s){
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                System.out.print(i + " ");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String res = StrFunc.concat(s1, s2);
        System.out.println("Contacetaned String: " +  res);
        System.out.println("Capital letters found at: ");
        StrFunc.findCapital(res);
        sc.close();
    }
}
