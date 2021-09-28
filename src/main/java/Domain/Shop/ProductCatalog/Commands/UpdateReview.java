package Domain.Shop.ProductCatalog.Commands;

import Domain.Shop.ProductCatalog.Values.Review;
import co.com.sofka.domain.generic.Command;

public class UpdateReview implements Command {

    private final Review review;

    public UpdateReview(Review review) {
        this.review = review;
    }

    public Review review(){
        return review;
    }
}
