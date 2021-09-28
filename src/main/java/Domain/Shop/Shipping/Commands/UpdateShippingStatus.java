package Domain.Shop.Shipping.Commands;

import Domain.Shop.Shipping.Values.ShippingStatus;
import co.com.sofka.domain.generic.Command;

public class UpdateShippingStatus implements Command {

    private final ShippingStatus shippingStatus;

    public UpdateShippingStatus(ShippingStatus shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public ShippingStatus shippingStatus(){
        return shippingStatus;
    }
}
