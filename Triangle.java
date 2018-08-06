
package triangle;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Triangle {

  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your base : ");
        int b = s.nextInt();
        System.out.println("enter your height : ");
        int h = s.nextInt();
        double triangle = 0.5*(b*h);
        System.out.println("triangle area is : " +triangle);
    }
    
}
