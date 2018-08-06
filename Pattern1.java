
package pattern1;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Pattern1 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = s.nextInt();
        for(int row=a;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print(" "+col);
            }
             System.out.println();
        }
    }
    }
    

