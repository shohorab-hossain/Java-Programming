
package mathclass;

/**
 *
 * @author HASIB
 */
public class Mathclass {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int max = Math.max(a, b);
        System.out.println("maximum number : " + max);
        int min = Math.min(a, b);
        System.out.println("minimum number : " +min);
        int pow = (int) Math.pow(a, b);
        System.out.println("pow is : "+pow);
        int abs = Math.abs(a);
        System.out.println("absolute number : "+abs);
        double sin = Math.sin(b);
        System.out.println("sin : "+sin);
    }
    
}
