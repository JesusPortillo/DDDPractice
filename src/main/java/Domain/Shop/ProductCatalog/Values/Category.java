package Domain.Shop.ProductCatalog.Values;

import co.com.sofka.domain.generic.ValueObject;

public class Category implements ValueObject<String> {

    private final String category;


    public Category(String category) {
        this.category = category;
    }

    @Override
    public String value() {
        return category;
    }
}
