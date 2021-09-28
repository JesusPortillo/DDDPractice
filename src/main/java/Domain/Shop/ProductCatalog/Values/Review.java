package Domain.Shop.ProductCatalog.Values;

import co.com.sofka.domain.generic.ValueObject;

public class Review implements ValueObject<String> {
    private final String review;

    public Review(String review) {
        this.review = review;
    }

    @Override
    public String value() {
        return review;
    }
}
