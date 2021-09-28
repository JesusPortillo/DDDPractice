package Domain.Shop.Order.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class DateOrder implements ValueObject<Date> {

    private final Date dateOrder;


    public DateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    @Override
    public Date value() {
        return dateOrder;
    }
}
