package Domain.Shop.Order.Values;

import Domain.Shop.ProductCatalog.Values.ProductId;
import co.com.sofka.domain.generic.Identity;

public class OrderId extends Identity {

    public OrderId(){}

    public OrderId(String id){
        super(id);
    }

    public static OrderId of(String id){
        return new OrderId(id);
    }
}
