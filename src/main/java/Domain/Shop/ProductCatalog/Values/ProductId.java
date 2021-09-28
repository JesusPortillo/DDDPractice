package Domain.Shop.ProductCatalog.Values;

import co.com.sofka.domain.generic.Identity;

public class ProductId extends Identity {
    public ProductId(){}

    public ProductId(String id){
        super(id);
    }

    public static ProductId of(String id){
        return new ProductId(id);
    }
}
