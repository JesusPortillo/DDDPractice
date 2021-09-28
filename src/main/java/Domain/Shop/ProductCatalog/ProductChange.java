package Domain.Shop.ProductCatalog;

import Domain.Shop.ProductCatalog.Events.*;
import co.com.sofka.domain.generic.EventChange;

public class ProductChange extends EventChange {

    public ProductChange(Product product){
        apply((ProductCreated event) -> {
            product.productName = event.productName();
            product.price = event.price();
            product.provider = event.provider();
            product.quantity = event.quantity();
            product.width = event.width();
            product.height = event.height();
            product.weight = event.weight();
            product.category = event.category();
        });

        apply((ProductUpdated event) -> {
            product.productName = event.productName();
            product.price = event.price();
            product.quantity = event.quantity();
            product.width = event.width();
            product.height = event.height();
            product.weight = event.weight();
            product.category = event.category();
        });

        apply((ProviderUpdated event) ->{
            product.provider = event.provider();
        });

        apply((ReviewAdded event) ->{
            product.review = event.review();
        });

        apply((ReviewUpdated event) ->{
            product.review = event.review();
        });
    }
}
