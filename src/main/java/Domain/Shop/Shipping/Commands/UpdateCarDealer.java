package Domain.Shop.Shipping.Commands;

import Domain.Shop.Shipping.Entities.CarDealer;
import co.com.sofka.domain.generic.Command;

public class UpdateCarDealer implements Command {

    private final CarDealer carDealer;

    public UpdateCarDealer(CarDealer carDealer) {
        this.carDealer = carDealer;
    }

    public CarDealer carDealer(){
        return carDealer;
    }
}
