package Domain.Shop.Shipping.Events;

import Domain.Shop.Order.Values.OrderId;
import Domain.Shop.Shipping.Entities.CarDealer;
import Domain.Shop.Shipping.Values.ShippingStatus;
import co.com.sofka.domain.generic.DomainEvent;

public class ShippingCreated extends DomainEvent {

    private final OrderId orderId;
    private final CarDealer carDealer;
    private final ShippingStatus shippingStatus;

    public ShippingCreated(OrderId orderId, CarDealer carDealer, ShippingStatus shippingStatus) {
        super("Domain.Shop.ProductCatalog.ShippingCreated");
        this.orderId = orderId;
        this.carDealer = carDealer;
        this.shippingStatus = shippingStatus;
    }
    public OrderId orderId(){
        return orderId;
    }

    public CarDealer carDealer(){
        return carDealer;
    }

    public ShippingStatus shippingStatus(){
        return shippingStatus;
    }
}
