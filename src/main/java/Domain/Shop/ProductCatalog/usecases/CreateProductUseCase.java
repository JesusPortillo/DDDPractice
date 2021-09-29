package Domain.Shop.ProductCatalog.usecases;

import Domain.Shop.ProductCatalog.Commands.CreateProduct;
import Domain.Shop.ProductCatalog.Product;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateProductUseCase extends UseCase<RequestCommand<CreateProduct>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateProduct> createProductRequestCommand) {
        var command = createProductRequestCommand.getCommand();

        var producto = new Product(
                command.productId(),
                command.productName(),
                command.price(),
                command.provider(),
                command.quantity(),
                command.width(),
                command.height(),
                command.weight(),
                command.category()
        );
        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));
    }
}
