//Write a java code to implement calculator using switch case
package q25;

public class Main {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        String symbol = args[1];
        int n2 = Integer.parseInt(args[2]);

        switch(symbol){
            case "+" :
                System.out.println(n1+n2);
                break;
            case "-" :
                System.out.println(n1-n2);
                break;
            case "*" :
                System.out.println(n1*n2);
                break;
            case "/" :
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
