
package capital.small;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class CapitalSmall {

   
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("enter your char");
     char ch = s.next().charAt(0);
     if(ch>='a' && ch<='z' ){
         System.out.println("small latter");
     }else{
         System.out.println("capital letter");
     }
    }
    
}
