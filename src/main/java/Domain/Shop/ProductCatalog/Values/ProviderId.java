package Domain.Shop.ProductCatalog.Values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class ProviderId extends Identity {

    public ProviderId(){}

    public ProviderId(String id){
        super(id);
    }

    public static ProviderId of(String id){
        return new ProviderId(id);
    }
}
