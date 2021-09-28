package Domain.Shop.Order.Values;

import co.com.sofka.domain.generic.ValueObject;

public class EstimatedDaysToArrive implements ValueObject<Integer> {

    private final Integer estimatedDaysToArrive;

    public EstimatedDaysToArrive(Integer estimatedDaysToArrive) {
        this.estimatedDaysToArrive = estimatedDaysToArrive;
    }

    @Override
    public Integer value() {
        return estimatedDaysToArrive;
    }
}
