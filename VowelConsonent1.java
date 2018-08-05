
package vowel.consonent1;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class VowelConsonent1 {

   
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("enter your char");
     char ch = s.next().charAt(0);
     if(ch=='a' || ch=='A'){
         System.out.println("vowel");
     }else if(ch=='e' || ch=='E'){
         System.out.println("vowel");
     }
     else if(ch=='i' || ch=='I'){
         System.out.println("vowel");
     }
     else if(ch=='o' || ch=='O'){
         System.out.println("vowel");
     }
     else if(ch=='u' || ch=='U'){
         System.out.println("vowel");
     }else{
         System.out.println("consonent");
     }
    }
    
}
