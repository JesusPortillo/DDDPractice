package Domain.Shop.Shipping.Values;

import co.com.sofka.domain.generic.ValueObject;

public class CarDealerName implements ValueObject<String> {

    private final String carDealerName;


    public CarDealerName(String carDealerName) {
        this.carDealerName = carDealerName;
    }

    @Override
    public String value() {
        return carDealerName;
    }
}
