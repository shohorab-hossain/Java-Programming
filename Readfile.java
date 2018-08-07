
package readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Readfile {


    public static void main(String[] args) throws FileNotFoundException {
       File file = new File("input.txt");
       Scanner s = new Scanner(file);
       
       while(s.hasNext()){
       String s1 = s.nextLine();
       System.out.println(s1);
       }
       
    }
    
}
