package Domain.Shop.ProductCatalog.Commands;

import Domain.Shop.ProductCatalog.Entities.Provider;
import Domain.Shop.ProductCatalog.Values.*;
import co.com.sofka.domain.generic.Command;

public class CreateProduct implements Command {

    private final ProductId productId;
    private final ProductName productName;
    private final Price price;
    private final Provider provider;
    private final Quantity quantity;
    private final Width width;
    private final Height height;
    private final Weight weight;
    private final Category category;

    public CreateProduct(ProductId productId, ProductName productName, Price price, Provider provider,
                          Quantity quantity, Width width, Height height, Weight weight, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.provider = provider;
        this.quantity = quantity;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.category = category;
    }

    public ProductId productId(){return productId;}

    public ProductName productName(){
        return productName;
    }

    public Price price(){
        return price;
    }

    public Provider provider(){
        return provider;
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
