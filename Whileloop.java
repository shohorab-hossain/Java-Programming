
package whileloop;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Whileloop {

  
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("enter your number : ");
       int num = s.nextInt();
       int i=1;
       while(i<=num){
           System.out.println("total num is : " +i);
           i++;
       }
    } 
    
}
