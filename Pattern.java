
package pattern;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Pattern {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = s.nextInt();
        for(int row=1;row<=a;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" "+col);
            }
             System.out.println();
        }
    }
    
}
