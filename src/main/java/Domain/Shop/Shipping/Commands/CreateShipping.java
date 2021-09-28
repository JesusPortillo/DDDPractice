package Domain.Shop.Shipping.Commands;

import Domain.Shop.Order.Values.OrderId;
import Domain.Shop.Shipping.Entities.CarDealer;
import Domain.Shop.Shipping.Values.ShippingStatus;
import co.com.sofka.domain.generic.Command;

public class CreateShipping implements Command {
    private final OrderId orderId;
    private final CarDealer carDealer;
    private final ShippingStatus shippingStatus;

    public CreateShipping(OrderId orderId, CarDealer carDealer, ShippingStatus shippingStatus) {
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
