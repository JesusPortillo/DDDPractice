package Domain.Shop.Order.Events;

import Domain.Shop.ProductCatalog.Values.ProductId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductIdAdded extends DomainEvent {

    private final ProductId productId;

    public ProductIdAdded(ProductId productId) {
        super("Domain.Shop.Order.ProductIdAdded");
        this.productId = productId;
    }

    public ProductId productId(){
        return productId;
    }
}
