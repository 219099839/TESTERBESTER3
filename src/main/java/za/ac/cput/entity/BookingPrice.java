package za.ac.cput.entity;

/* BookingPrice.java
   Entity for the BookingPrice
   Author: Nawaaz Amien (219099839)
   Date: 14 March 2022
 */

public class BookingPrice {
    private String BookingId;
    private String CustomerId;
    private int deposit_price;
    public String waiterId;
    public String tableId;

    public BookingPrice(){}

    //insert private constructor
    private BookingPrice(BookingPrice.Builder builder) {
        this.BookingId = builder.BookingId;
        this.CustomerId = builder.CustomerId;
        this.deposit_price = builder.deposit_price;
        this.waiterId = builder.waiterId;
        this.tableId = builder.tableId;
    }

    public String getBookingId() {
        return BookingId;
    }

    public String getCustomerId() {
        return CustomerId;
    }


    public String getWaiterId() {
        return waiterId;
    }


    public String getTableId() {
        return tableId;
    }


    public int getDeposit_price() {
        return deposit_price;
    }


    @Override
    public String toString() {
        return "BookingPrice{" +
                "BookingId='" + BookingId + '\'' +
                ", CustomerId='" + CustomerId + '\'' +
                ", deposit_price=" + deposit_price +
                ", waiterId='" + waiterId + '\'' +
                ", tableId=" + tableId +
                '}';
    }

    public static class Builder {
        private String BookingId;
        private String CustomerId;
        private int deposit_price;
        public String waiterId;
        public String tableId;

        public Builder setBookingId(String bookingId) {
            BookingId = bookingId;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            CustomerId = customerId;
            return this;
        }

        public Builder setWaiterId(String waiterId) {
            this.waiterId = waiterId;
            return this;
        }

        public Builder setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }

        public Builder setDeposit_price(int deposit_price) {
            this.deposit_price = deposit_price;
            return this;
        }

        public BookingPrice.Builder copy(BookingPrice booking) {
            this.BookingId = booking.BookingId;
            this.CustomerId = booking.CustomerId;
            this.waiterId = booking.waiterId;
            this.deposit_price = booking.deposit_price;
            this.tableId = booking.tableId;
            return this;
        }

        public BookingPrice build() {
            return new BookingPrice(this);
        }
    }

}
