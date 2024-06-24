//Write a java program to create a new file and write "hello World" into it. Reverse the contents word-wise and append it into the end of another file.
package q23;

import java.io.*;

class ReverseFileContents{
    static String reverseString(String text){
        String[] words = text.split(" ");
        int n = words.length;

        // swap gradually the start and end elements till middle of the text
        for(int i=0; i<n/2; i++){
            String temp = words[i];
            words[i] = words[n-i-1];
            words[n-i-1] = temp;
        }

        StringBuilder rev = new StringBuilder();
        for(String word : words){
            rev.append(word).append(" ");
        }
        return rev.toString().trim();
    }
}

public class Main {
    public static void main(String[] args) {
        String text = "Hello World", rev = "", preContent = "This file says the ";
        
        // Step1: Write "Hello World" to file1.txt
        try(FileWriter fw1 = new FileWriter("file1.txt")){
            fw1.write(text);
            System.out.println("file1.txt created with text: " + text);
        }catch(IOException e){
            e.printStackTrace();
        }

        // Step2: Reverse the String
        rev = ReverseFileContents.reverseString(text);

        // Step3: Write preContent to file2.txt if it doesn't already exists, then append the reversed text
        File file2 = new File("file2.txt");
        boolean appendPreContent = !file2.exists() || file2.length() == 0;
        try(FileWriter fw2 = new FileWriter(file2, true)){
            // Write preContent to file2.txt if the file is new or empty
            if(appendPreContent){
                fw2.write(preContent+ "\n");
                System.out.println("file2.txt initialized with pre-content: " + preContent);
            }

            // Append the reversed text
            fw2.write(rev + "\n");
            System.out.println("Reversed text appended to the file2.txt: " + rev);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
