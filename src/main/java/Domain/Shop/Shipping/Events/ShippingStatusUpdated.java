package Domain.Shop.Shipping.Events;

import Domain.Shop.Shipping.Values.ShippingStatus;
import co.com.sofka.domain.generic.DomainEvent;

public class ShippingStatusUpdated extends DomainEvent {

    private final ShippingStatus shippingStatus;

    public ShippingStatusUpdated(ShippingStatus shippingStatus) {
        super("Domain.Shop.ProductCatalog.ShippingStatusUpdated");
        this.shippingStatus = shippingStatus;
    }

    public ShippingStatus shippingStatus(){
        return shippingStatus;
    }
}
