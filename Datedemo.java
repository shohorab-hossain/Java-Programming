
package datedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HASIB
 */
public class Datedemo {

    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d));
    }
    
}
