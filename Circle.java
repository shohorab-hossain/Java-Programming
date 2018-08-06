
package circle;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Circle {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your cirle number : ");
        int a = s.nextInt();
        double circle = (3.1416 * (a*a));
        System.out.println("cirle area is : " + circle);
    }
    
}
