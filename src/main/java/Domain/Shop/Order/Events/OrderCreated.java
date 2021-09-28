package Domain.Shop.Order.Events;

import Domain.Shop.Order.Entities.Customer;
import Domain.Shop.Order.Order;
import Domain.Shop.Order.Values.EstimatedDaysToArrive;
import Domain.Shop.Order.Values.OrderDate;
import Domain.Shop.Order.Values.OrderStatus;
import Domain.Shop.ProductCatalog.Values.ProductId;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class OrderCreated extends DomainEvent {

    private final List<ProductId> productIdList;
    private final OrderStatus orderStatus;
    private final Customer customer;
    private final OrderDate orderDate;
    private final EstimatedDaysToArrive estimatedDaysToArrive;


    public OrderCreated(List<ProductId> productIdList, OrderStatus orderStatus, Customer customer, OrderDate orderDate, EstimatedDaysToArrive estimatedDaysToArrive) {
        super("Domain.Shop.Order.OrderCreated");
        this.productIdList = productIdList;
        this.orderStatus = orderStatus;
        this.customer = customer;
        this.orderDate = orderDate;
        this.estimatedDaysToArrive = estimatedDaysToArrive;
    }

    public List<ProductId> productIdList(){
        return productIdList;
    }

    public OrderStatus orderStatus(){
        return orderStatus;
    }

    public Customer customer(){
        return customer;
    }

    public OrderDate orderDate(){
        return orderDate;
    }

    public EstimatedDaysToArrive estimatedDaysToArrive(){
        return estimatedDaysToArrive;
    }
}
