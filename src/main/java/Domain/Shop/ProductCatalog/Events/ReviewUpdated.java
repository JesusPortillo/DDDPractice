package Domain.Shop.ProductCatalog.Events;

import Domain.Shop.ProductCatalog.Values.Review;
import co.com.sofka.domain.generic.DomainEvent;

public class ReviewUpdated extends DomainEvent {

    private final Review review;

    public ReviewUpdated(Review review) {
        super("Domain.Shop.ProductCatalog.ReviewUpdated");
        this.review = review;
    }

    public Review review(){
        return review;
    }
}
