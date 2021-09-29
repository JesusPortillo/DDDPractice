package Domain.Shop.ProductCatalog.usecases;

import Domain.Shop.ProductCatalog.Events.ProductCreated;
import Domain.Shop.ProductCatalog.Product;
import Domain.Shop.ProductCatalog.Values.ProductId;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;

public class AlertByQuantityUseCase extends UseCase<TriggeredEvent<ProductCreated>, ResponseEvents> {

    private final String MESSAGE = "No deberías agregar un producto con cantidad 0";

    @Override
    public void executeUseCase(TriggeredEvent<ProductCreated> productCreatedTriggeredEvent) {
        var event = productCreatedTriggeredEvent.getDomainEvent();
        var product = Product.from(ProductId.of(event.aggregateRootId()), this.retrieveEvents());


        if (event.quantity().value() == 0){
            product.sendAlert(MESSAGE);
            emit().onResponse(new ResponseEvents(product.getUncommittedChanges()));
        }
    }
}
