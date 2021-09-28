package Domain.Shop.Order.Events;

import Domain.Shop.ProductCatalog.Values.ProductId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductIdRemoved extends DomainEvent {
    private final ProductId productId;

    public ProductIdRemoved(ProductId productId) {
        super("Domain.Shop.Order.ProductIdRemoved");
        this.productId = productId;
    }

    public ProductId productId(){
        return productId;
    }
}
