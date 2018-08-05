
package ifelse;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Ifelse {

    
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("enter your number : ");
      int num = s.nextInt();
      if(num>=32 && num<=39){
          System.out.println("you got D");
      }else if(num>=40 && num<=49){
          System.out.println("you got C");
      }else if(num>=50 && num<=59){
          System.out.println("you got B");
      }else if(num>=60 && num<=65){
          System.out.println("you got B+");
      }else if(num>=66 && num<=69){
          System.out.println("you got A-");
      }else if(num>=70 && num<=79){
          System.out.println("you got A");
      }else if(num>=80 && num<=100){
          System.out.println("you got A+");
      }else{
          System.out.println("you are failure");
      }
    }
    
}
