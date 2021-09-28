package Domain.Shop.Order.Values;

import co.com.sofka.domain.generic.ValueObject;

public class OrderStatus implements ValueObject<String> {

    private final String orderStatus;

    public OrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String value() {
        return orderStatus;
    }
}
