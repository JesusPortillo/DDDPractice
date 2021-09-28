package Domain.Shop.Order.Commands;

import Domain.Shop.Order.Values.OrderStatus;
import co.com.sofka.domain.generic.Command;

public class UpdateOrderStatus implements Command {

    private final OrderStatus orderStatus;

    public UpdateOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderStatus orderStatus(){
        return orderStatus;
    }
}
