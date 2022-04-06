package za.ac.cput.util;

/* NawaazHelper.java
   Entity for the NawaazHelper
   Author: Nawaaz Amien (219099839)
   Date: 27 March 2022
 */

import java.util.UUID;

public class NawaazHelper {

    public static String managerId(){return UUID.randomUUID().toString();}
//to test if null or empty

    public static String bookingId(){return UUID.randomUUID().toString();}
//to test if null or empty

    public static String bookingCustomerId(){return UUID.randomUUID().toString();}
//to test if null or empty

    public static String bookingWaiterId(){return UUID.randomUUID().toString();}
//to test if null or empty

    public static String bookingTableId(){return UUID.randomUUID().toString();}
//to test if null or empty
}
