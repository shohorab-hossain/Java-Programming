
package vowel.consonent;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class VowelConsonent {

   
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("enter your char");
     char ch = s.next().charAt(0);
     if(ch=='a'){
         System.out.println("vowel");
     }else if(ch=='e'){
         System.out.println("vowel");
     }
     else if(ch=='i'){
         System.out.println("vowel");
     }
     else if(ch=='o'){
         System.out.println("vowel");
     }
     else if(ch=='u'){
         System.out.println("vowel");
     }else{
         System.out.println("consonent");
     }
    }
    
}
