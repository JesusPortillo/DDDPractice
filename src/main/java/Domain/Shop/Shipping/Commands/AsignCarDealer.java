package Domain.Shop.Shipping.Commands;

import Domain.Shop.Shipping.Entities.CarDealer;
import co.com.sofka.domain.generic.Command;

public class AsignCarDealer implements Command {

    private final CarDealer carDealer;

    public AsignCarDealer(CarDealer carDealer) {
        this.carDealer = carDealer;
    }

    public CarDealer carDealer(){
        return carDealer;
    }
}
