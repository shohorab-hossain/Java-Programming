
package rectangle;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Rectangle {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your lenght and width");
        int l,w;
        l = s.nextInt();
        w = s.nextInt();
        double rectangle = l*w;
        System.out.println("rectangle area is : "+rectangle);
    }
    
}
