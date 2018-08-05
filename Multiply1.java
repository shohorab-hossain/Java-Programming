
package multiply1;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Multiply1 {

    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("enter your number : ");
       int num = s.nextInt();
       
       for(int i=1;i<=12;i++){
         System.out.println(num + " X " + i + " = " + i*num);
           
       }
    }
    
}
