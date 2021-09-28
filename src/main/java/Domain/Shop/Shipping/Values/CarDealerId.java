package Domain.Shop.Shipping.Values;

import Domain.Shop.ProductCatalog.Values.ProductId;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class CarDealerId extends Identity {

    public CarDealerId(){}

    public CarDealerId(String id){
        super(id);
    }

    public static CarDealerId of(String id){
        return new CarDealerId(id);
    }
}
