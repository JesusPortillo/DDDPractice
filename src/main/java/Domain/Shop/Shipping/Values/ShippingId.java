package Domain.Shop.Shipping.Values;

import Domain.Shop.ProductCatalog.Values.ProductId;
import co.com.sofka.domain.generic.Identity;

public class ShippingId extends Identity {

    public ShippingId(){}

    public ShippingId(String id){
        super(id);
    }

    public static ShippingId of(String id){
        return new ShippingId(id);
    }
}
