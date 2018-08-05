
package forloop;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Forloop {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("enter your number : ");
       int num = s.nextInt();
      // num=12;
       for(int i=1;i<=num;i++){
           System.out.println("total number is : "+i);
       }
    }
    
}
