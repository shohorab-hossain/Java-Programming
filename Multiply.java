
package multiply;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Multiply {

    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("enter your first number : \n");
       int num = s.nextInt();
       System.out.println("enter your second number : \n");
       int num1 = s.nextInt();
       double total = num*num1;
       System.out.println("total number is : "+total);
    }
    
}
