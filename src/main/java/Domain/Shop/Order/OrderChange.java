package Domain.Shop.Order;


import Domain.Shop.Order.Events.OrderCreated;
import Domain.Shop.Order.Events.OrderStatusUpdated;
import Domain.Shop.Order.Events.ProductIdAdded;
import Domain.Shop.Order.Events.ProductIdRemoved;
import co.com.sofka.domain.generic.EventChange;

public class OrderChange extends EventChange {

    public OrderChange(Order order){
        apply((OrderCreated event) ->{
            order.productIdList = event.productIdList();
            order.customer = event.customer();
            order.dateOrder = event.orderDate();
            order.estimatedDaysToArrive = event.estimatedDaysToArrive();
        });

        apply((OrderStatusUpdated event) -> {
            order.orderStatus = event.orderStatus();
        });

        apply((ProductIdAdded event) ->{
            order.productIdList.add(event.productId());
        });

        apply((ProductIdRemoved event) ->{
            order.productIdList.remove(event.productId());
        });
    }
}
//productIdList, customer, orderDate, estimatedDaysToArrive