package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.BookingPrice;
import za.ac.cput.factory.BookingPriceFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class BookingPriceRepositoryTest {

    private static BookingPriceRepository bpRepository =BookingPriceRepository.getRepository();
    private static BookingPrice bookingPrice= BookingPriceFactory.createBooking(600);

    //Test to Create
    @Test
    public void booking_create() {
        BookingPrice created= bpRepository.create(bookingPrice);
        assertEquals(bookingPrice.getBookingId(),created.getBookingId());
        System.out.println("Create:" + created);
    }

    //Test to Read
    @Test
    public void booking_read() {
        BookingPrice read = bpRepository.read(bookingPrice.getBookingId());
        assertNotNull(read);
        System.out.println("Read:" +read);
    }

    //Test to Update
    @Test
    public void booking_update() {
        BookingPrice updated= new BookingPrice.Builder().copy(bookingPrice)
                .setDeposit_price(600)
                .build();
        assertNotNull(bpRepository.update(updated));
        System.out.println("Updated:" + updated);
    }


    //Test to Delete
    @Test
    public void booking_delete() {
        boolean success=bpRepository.delete(bookingPrice.getBookingId());
        assertTrue(success);
        System.out.println("It has been deleted: " + true);

    }


    //Test to Get all
    @Test
    public void booking_getAll() {
        System.out.println("Showing all:");
        System.out.println(bpRepository.getAll());
    }
}