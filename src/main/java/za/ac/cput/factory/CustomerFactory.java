package za.ac.cput.factory;

import za.ac.cput.entity.Customer;
import za.ac.cput.util.WarrenHelper;

public class CustomerFactory {
    public static Customer createCustomer(String customerName, String customerSurname, String customerEmail, String customerCell, String customerTemperature)
    {
        //email validation...regex

        if(!WarrenHelper.isValidEmail(customerEmail))
        {
            System.out.println("Not a valid email");
            return null;
        }
        if(WarrenHelper.isNullorEmpty(customerName)||WarrenHelper.isNullorEmpty(customerSurname))
            return null;



        String personId= WarrenHelper.buyerId();
        Customer customer=new Customer.Builder().setCustomerID(personId)
                .setCustomerName(customerName)
                .setCustomerSurname(customerSurname)
                .setCustomerEmail(customerEmail)
                .setCustomerCellNumber(customerCell)
                .setCustomerTemperature(customerTemperature)
                .build();
        return customer;
    }
}

