// Write a java program to list out recently(within 2 min) updated file list

package q24;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        String dirPath = "folder";
        File dir = new File(dirPath);
        File[] files = dir.listFiles();

        
        if(files != null){
            long timeLimit = System.currentTimeMillis() - (2*60*1000);
            for(File file : files){
                if((file.lastModified()) >= timeLimit){
                    System.out.println(file.getName());
                }
            }
        }
    }
}
