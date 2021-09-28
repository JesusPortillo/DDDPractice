package Domain.Shop.Shipping.Values;

import co.com.sofka.domain.generic.ValueObject;

public class ShippingStatus implements ValueObject<String> {

    private final String shippingStatus;


    public ShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    @Override
    public String value() {
        return shippingStatus;
    }
}
