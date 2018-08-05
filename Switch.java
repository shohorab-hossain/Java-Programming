
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Switch {

   
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("enter your first number : \n");
       int num = s.nextInt();
       switch(num){
           case 1:
               System.out.println("hasib is a good student");
               break;
           case 2:
               System.out.println("my hobby is gaming");
               break;
           case 3:
               System.out.println("my eye color is balck");
               break;
           case 4:
               System.out.println("I love programming");
               break;
           default :
               System.out.println("nothing to do!!!!");
       }
    }
    
}
