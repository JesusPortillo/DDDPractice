package Domain.Shop.Order;

import Domain.Shop.Order.Entities.Customer;
import Domain.Shop.Order.Events.OrderCreated;
import Domain.Shop.Order.Events.OrderStatusUpdated;
import Domain.Shop.Order.Events.ProductIdAdded;
import Domain.Shop.Order.Events.ProductIdRemoved;
import Domain.Shop.Order.Values.*;
import Domain.Shop.ProductCatalog.Values.ProductId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Order extends AggregateEvent<OrderId> {

    protected List<ProductId> productIdList;
    protected OrderStatus orderStatus;
    protected Customer customer;
    protected OrderDate dateOrder;
    protected EstimatedDaysToArrive estimatedDaysToArrive;

    public Order(OrderId entityId, List<ProductId> productIdList, OrderStatus orderStatus, Customer customer, OrderDate orderDate,
                 EstimatedDaysToArrive estimatedDaysToArrive) {
        super(entityId);
        appendChange(new OrderCreated(productIdList, orderStatus, customer, orderDate, estimatedDaysToArrive)).apply();
    }

    private Order(OrderId entityId){
        super(entityId);
        subscribe(new OrderChange(this));
    }

    public static Order from(OrderId orderId, List<DomainEvent> events){
        Order order = new Order(orderId);
        events.forEach(order::applyEvent);
        return order;
    }

    public void updateOrderStatus(OrderStatus orderStatus){
        Objects.requireNonNull(orderStatus);
        appendChange(new OrderStatusUpdated(orderStatus)).apply();
    }

    public void addProductId(ProductId productId){
        Objects.requireNonNull(productId);
        appendChange(new ProductIdAdded(productId)).apply();
    }

    public void removeProductId(ProductId productId) {
        Objects.requireNonNull(productId);
        appendChange(new ProductIdRemoved(productId)).apply();
    }


}
