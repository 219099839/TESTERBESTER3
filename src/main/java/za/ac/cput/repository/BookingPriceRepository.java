package za.ac.cput.repository;

import za.ac.cput.entity.BookingPrice;

import java.util.HashSet;
import java.util.Set;

public class BookingPriceRepository implements IBookingPriceRepository{
    private static BookingPriceRepository repository=null;
    private Set<BookingPrice> bookingPriceDB=null;

    private BookingPriceRepository(){

        bookingPriceDB=new HashSet<BookingPrice>();
    }
    public static BookingPriceRepository getRepository() {
        if (repository == null){
            repository = new BookingPriceRepository();
        }
        return repository;
    }
    @Override
    public BookingPrice create(BookingPrice bookingPrice) {

        boolean success=bookingPriceDB.add(bookingPrice);
        if(!success)
            return null;
        return bookingPrice;
    }

    @Override
    public BookingPrice read(String bookingId) {

        BookingPrice bookingPrice=bookingPriceDB.stream()
                .filter(e-> e.getBookingId().equals(bookingId))
                .findAny()
                .orElse(null);
        return bookingPrice;
    }

    @Override
    public BookingPrice update(BookingPrice bookingPrice) {
        BookingPrice oldBooking=read(bookingPrice.getBookingId());
        if(oldBooking !=null) {
            bookingPriceDB.remove(oldBooking);
            bookingPriceDB.add(bookingPrice);
            return bookingPrice;
        }
        return null;

    }

    @Override
    public boolean delete(String bookingId) {
        BookingPrice bookingPriceToDelete=read(bookingId);
        if(bookingPriceToDelete == null)
            return false;
        bookingPriceDB.remove(bookingPriceToDelete);
        return true;

    }
    @Override
    public Set<BookingPrice> getAll() {
        return bookingPriceDB;
    }
}
