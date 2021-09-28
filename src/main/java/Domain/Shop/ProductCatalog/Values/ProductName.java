package Domain.Shop.ProductCatalog.Values;

import co.com.sofka.domain.generic.ValueObject;

public class ProductName implements ValueObject<String> {

    private final String productName;

    public ProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String value() {
        return productName;
    }
}
