package Domain.Shop.Shipping.Events;

import Domain.Shop.Shipping.Entities.CarDealer;
import co.com.sofka.domain.generic.DomainEvent;

public class CarDealerAsigned extends DomainEvent {

    private final CarDealer carDealer;
    public CarDealerAsigned(CarDealer carDealer) {
        super("Domain.Shop.ProductCatalog.CarDealerAsigned");
        this.carDealer = carDealer;
    }

    public CarDealer carDealer(){
        return carDealer;
    }
}
