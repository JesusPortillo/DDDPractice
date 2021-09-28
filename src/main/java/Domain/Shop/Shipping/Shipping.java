package Domain.Shop.Shipping;

import Domain.Shop.Order.Values.OrderId;
import Domain.Shop.ProductCatalog.Product;
import Domain.Shop.ProductCatalog.ProductChange;
import Domain.Shop.ProductCatalog.Values.ProductId;
import Domain.Shop.Shipping.Entities.CarDealer;
import Domain.Shop.Shipping.Events.*;
import Domain.Shop.Shipping.Values.ShippingId;
import Domain.Shop.Shipping.Values.ShippingStatus;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Shipping extends AggregateEvent<ShippingId> {

    protected OrderId orderId;
    protected CarDealer carDealer;
    protected ShippingStatus shippingStatus;

    public Shipping(ShippingId entityId, OrderId orderId, CarDealer carDealer, ShippingStatus shippingStatus) {
        super(entityId);
        this.orderId = orderId;
        this.carDealer = carDealer;
        this.shippingStatus = shippingStatus;
        appendChange(new ShippingCreated(orderId, carDealer, shippingStatus)).apply();
    }

    private Shipping(ShippingId entityId){
        super(entityId);
        subscribe(new ShippingChange(this));
    }

    public static Shipping from(ShippingId shippingId, List<DomainEvent> events){
        Shipping shipping = new Shipping(shippingId);
        events.forEach(shipping::applyEvent);
        return shipping;
    }

    public void updateShippingStatus(ShippingStatus shippingStatus){
        Objects.requireNonNull(shippingStatus);
        appendChange(new ShippingStatusUpdated(shippingStatus)).apply();
    }

    public void asignCarDealer(CarDealer carDealer){
        Objects.requireNonNull(carDealer);
        appendChange(new CarDealerAsigned(carDealer)).apply();
    }

    public void updateCarDealer(CarDealer carDealer){
        Objects.requireNonNull(carDealer);
        appendChange(new CarDealerUpdated(carDealer)).apply();
    }

}
