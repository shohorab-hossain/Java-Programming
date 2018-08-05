
package even.odd;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class EvenOdd {

  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("number of odd or even :");
        int num = s.nextInt();
        if(num%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    
}
