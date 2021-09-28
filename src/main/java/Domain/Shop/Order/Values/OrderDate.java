package Domain.Shop.Order.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class OrderDate implements ValueObject<Date> {

    private final Date orderDate;

    public OrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public Date value() {
        return orderDate;
    }
}
