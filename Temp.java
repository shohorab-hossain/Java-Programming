
package temp;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Temp {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your number : ");
        int num = s.nextInt();
        double num1 = num *(9/5)+32;
        System.out.println("tempature is : "+num1);
    }
    
}
