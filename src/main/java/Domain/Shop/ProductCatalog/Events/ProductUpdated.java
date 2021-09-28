package Domain.Shop.ProductCatalog.Events;

import Domain.Shop.ProductCatalog.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductUpdated extends DomainEvent {

    private final ProductName productName;
    private final Price price;
    private final Quantity quantity;
    private final Width width;
    private final Height height;
    private final Weight weight;
    private final Category category;

    public ProductUpdated(ProductName productName, Price price,
                          Quantity quantity, Width width, Height height, Weight weight, Category category) {
        super("Domain.Shop.ProductCatalog.ProductUpdated");
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.category = category;
    }

    public ProductName productName(){
        return productName;
    }

    public Price price(){
        return price;
    }

    public Quantity quantity(){
        return quantity;
    }

    public Width width(){
        return width;
    }

    public Height height(){
        return height;
    }

    public Weight weight(){
        return weight;
    }

    public Category category(){
        return category;
    }


}
