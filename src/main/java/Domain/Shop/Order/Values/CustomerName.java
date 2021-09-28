package Domain.Shop.Order.Values;

import co.com.sofka.domain.generic.ValueObject;

public class CustomerName implements ValueObject<String> {

    private final String customerName;

    public CustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String value() {
        return customerName;
    }
}
