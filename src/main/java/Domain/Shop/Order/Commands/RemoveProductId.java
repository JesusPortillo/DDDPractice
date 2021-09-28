package Domain.Shop.Order.Commands;

import Domain.Shop.ProductCatalog.Values.ProductId;
import co.com.sofka.domain.generic.Command;

public class RemoveProductId implements Command {

    private final ProductId productId;

    public RemoveProductId(ProductId productId) {
        this.productId = productId;
    }

    public ProductId productId(){
        return productId;
    }
}
