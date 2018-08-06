
package square;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Square {

   
    public static void main(String[] args) {
        //area formula
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your square  is :");
        int s = sc.nextInt();
        double square = s*s;
        System.out.println("square area is : " +square);
        
        //perimeter formula
        
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter your square  is :");
        int a = sca.nextInt();
        double sqr = 4*a;
        System.out.println("square perimeter is : "+sqr);
    }
    
}
