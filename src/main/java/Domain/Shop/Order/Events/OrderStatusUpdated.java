package Domain.Shop.Order.Events;

import Domain.Shop.Order.Values.OrderStatus;
import co.com.sofka.domain.generic.DomainEvent;

public class OrderStatusUpdated extends DomainEvent {

    private final OrderStatus orderStatus;

    public OrderStatusUpdated(OrderStatus orderStatus) {
        super("Domain.Shop.Order.OrderStatusUpdated");
        this.orderStatus = orderStatus;
    }

    public OrderStatus orderStatus(){
        return orderStatus;
    }
}
