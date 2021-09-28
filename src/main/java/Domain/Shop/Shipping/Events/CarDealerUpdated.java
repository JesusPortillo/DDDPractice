package Domain.Shop.Shipping.Events;

import Domain.Shop.Shipping.Entities.CarDealer;
import co.com.sofka.domain.generic.DomainEvent;

public class CarDealerUpdated extends DomainEvent {
    private final CarDealer carDealer;

    public CarDealerUpdated(CarDealer carDealer) {
        super("Domain.Shop.ProductCatalog.CarDealerUpdated");
        this.carDealer = carDealer;
    }

    public CarDealer carDealer(){
        return carDealer;
    }
}
