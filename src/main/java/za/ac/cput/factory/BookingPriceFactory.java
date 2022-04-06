package za.ac.cput.factory;

/* BookingPriceFactory.java
   Entity for the BookingPriceFactory
   Author: Nawaaz Amien (219099839)
   Date: 27 March 2022
 */

import za.ac.cput.entity.BookingPrice;
import za.ac.cput.util.NawaazHelper;

public class BookingPriceFactory {
    public static BookingPrice createBooking( int deposit_price){
        String customerBookingId= NawaazHelper.bookingId();
        String customerId= NawaazHelper.bookingCustomerId();
        String waiterId= NawaazHelper.bookingWaiterId();
        String tableId= NawaazHelper.bookingTableId();
        BookingPrice bookingPrice = new BookingPrice.Builder().setBookingId(customerBookingId)
                .setCustomerId(customerId)
                .setDeposit_price(deposit_price)
                .setWaiterId(waiterId)
                .setTableId(tableId)
                .build();
        return bookingPrice;
    }

}
