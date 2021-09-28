package Domain.Shop.Order.Entities;

import Domain.Shop.Order.Values.*;
import co.com.sofka.domain.generic.Entity;

public class Customer extends Entity<CustomerId> {

    protected CustomerName customerName;
    protected Birthday birthday;
    protected Email email;
    protected Address address;

    public Customer(CustomerId entityId, CustomerName customerName, Birthday birthday, Email email,
                    Address address) {
        super(entityId);
        this.customerName = customerName;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
    }

    public CustomerName CustomerName() {
        return customerName;
    }

    public void setCustomerName(CustomerName customerName) {
        this.customerName = customerName;
    }

    public Birthday Birthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public Email Email() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Address Address() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void updateCustomer(CustomerName customerName, Birthday birthday, Email email, Address address){
        setCustomerName(customerName);
        setBirthday(birthday);
        setEmail(email);
        setAddress(address);
    }
}
