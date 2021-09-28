package Domain.Shop.ProductCatalog.Events;

import Domain.Shop.ProductCatalog.Entities.Provider;
import Domain.Shop.ProductCatalog.Values.Review;
import co.com.sofka.domain.generic.DomainEvent;

public class ReviewAdded extends DomainEvent {

    private final Review review;

    public ReviewAdded(Review review) {
        super("Domain.Shop.ProductCatalog.ProviderUpdated");
        this.review = review;
    }

    public Review review(){
        return review;
    }
}
