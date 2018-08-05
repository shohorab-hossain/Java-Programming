
package timedemo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author HASIB
 */
public class Timedemo {

    public static void main(String[] args) {
       LocalTime time = LocalTime.now();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh-mm-ss ");
       time.format(formatter);
       System.out.println(time);
       
    }
    
}
