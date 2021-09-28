package Domain.Shop.Shipping.Entities;

import Domain.Shop.Shipping.Values.CarDealerId;
import Domain.Shop.Shipping.Values.CarDealerName;
import co.com.sofka.domain.generic.Entity;

public class CarDealer extends Entity<CarDealerId> {

    protected CarDealerName carDealerName;

    public CarDealer(CarDealerId entityId, CarDealerName carDealerName) {
        super(entityId);
        this.carDealerName = carDealerName;
    }

    public CarDealerName CarDealerName() {
        return carDealerName;
    }

    public void setCarDealerName(CarDealerName carDealerName) {
        this.carDealerName = carDealerName;
    }

    public void updateCarDealer(CarDealerName carDealerName){
        setCarDealerName(carDealerName);
    }
}
