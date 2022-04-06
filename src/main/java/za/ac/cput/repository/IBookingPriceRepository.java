package za.ac.cput.repository;

import za.ac.cput.entity.BookingPrice;

import java.util.Set;

public interface IBookingPriceRepository  extends IRepository<BookingPrice, String>{
    BookingPrice create(BookingPrice bookingPrice);

    BookingPrice read(String bookingId);

    BookingPrice update(BookingPrice bookingPrice);

    boolean delete(String bookingId);

    Set<BookingPrice> getAll();
}
