package Domain.Shop.Order.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class Birthday implements ValueObject<Date> {

    private final Date birthdate;

    public Birthday(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public Date value() {
        return birthdate;
    }
}
