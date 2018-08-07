
package primenumber;

import java.util.Scanner;

/**
 *
 * @author HASIB
 */
public class Primenumber {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your intial number : ");
        int i,j;
        int a = s.nextInt();
        int b = s.nextInt();
        for(i=a;i<=b;i++){
            for(j=2;j<=i-1;j++){
               if(i%j==0){
                   System.out.println("not prime = " +i);
                   break;
               } 
            }
            if(i==j){
                System.out.println("prime = "+i);
            }
        }
        
        }
        
    }
    

