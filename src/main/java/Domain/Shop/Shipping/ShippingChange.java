package Domain.Shop.Shipping;

import Domain.Shop.Shipping.Events.CarDealerAsigned;
import Domain.Shop.Shipping.Events.CarDealerUpdated;
import Domain.Shop.Shipping.Events.ShippingCreated;
import Domain.Shop.Shipping.Events.ShippingStatusUpdated;
import co.com.sofka.domain.generic.EventChange;

public class ShippingChange extends EventChange {

    public ShippingChange(Shipping shipping){
        apply((ShippingCreated event) -> {
            shipping.orderId = event.orderId();
            shipping.carDealer = event.carDealer();
            shipping.shippingStatus = event.shippingStatus();
        });

        apply((ShippingStatusUpdated event) -> {
            shipping.shippingStatus = event.shippingStatus();
        });

        apply((CarDealerAsigned event )->{
            shipping.carDealer = event.carDealer();
        });

        apply((CarDealerUpdated event )-> {
            shipping.carDealer = event.carDealer();
        });
    }
}
