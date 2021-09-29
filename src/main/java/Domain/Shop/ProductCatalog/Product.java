package Domain.Shop.ProductCatalog;

import Domain.Shop.ProductCatalog.Entities.Provider;
import Domain.Shop.ProductCatalog.Events.*;
import Domain.Shop.ProductCatalog.Values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;


public class Product extends AggregateEvent<ProductId> {

    protected ProductName productName;
    protected Review review;
    protected Price price;
    protected Provider provider;
    protected Quantity quantity;
    protected Width width;
    protected Height height;
    protected Weight weight;
    protected Category category;

    public Product(ProductId entityId, ProductName productName, Price price, Provider provider,
                   Quantity quantity, Width width, Height height, Weight weight, Category category) {
        super(entityId);
        appendChange(new ProductCreated(productName, price, provider, quantity, width,
                    height, weight, category)).apply();
    }

    private Product(ProductId entityId){
        super(entityId);
        subscribe(new ProductChange(this));
    }

    public static Product from(ProductId productId, List<DomainEvent> events){
        Product product = new Product(productId);
        events.forEach(product::applyEvent);
        return product;
    }

    public void updateProduct(ProductName productName, Price price, Quantity quantity,
                                Width width, Height height, Weight weight, Category category){
        Objects.requireNonNull(productName);
        Objects.requireNonNull(price);
        Objects.requireNonNull(quantity);
        Objects.requireNonNull(width);
        Objects.requireNonNull(height);
        Objects.requireNonNull(weight);
        Objects.requireNonNull(category);
        appendChange(new ProductUpdated(productName, price, quantity, width, height, weight, category)).apply();
    }

    public void updateProvider(Provider provider){
        Objects.requireNonNull(provider);
        appendChange(new ProviderUpdated(provider)).apply();
    }

    public void addReview(Review review){
        Objects.requireNonNull(review);
        appendChange(new ReviewAdded(review)).apply();
    }

    public void updateReview(Review review){
        Objects.requireNonNull(review);
        appendChange(new ReviewUpdated(review)).apply();
    }


    public void sendAlert(String message) {
        appendChange(new AlertSended(message)).apply();
    }
}
