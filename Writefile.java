
package writefile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author HASIB
 */
public class Writefile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       File file = new File("input.txt");
       FileOutputStream fos = new FileOutputStream(file,true);
       PrintWriter writer = new PrintWriter(fos);
       writer.append(" hasib is good student");
       writer.close();
       fos.close();
      
    }
    
}
