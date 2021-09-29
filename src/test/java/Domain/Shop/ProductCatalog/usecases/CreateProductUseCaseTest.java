package Domain.Shop.ProductCatalog.usecases;

import Domain.Shop.ProductCatalog.Commands.CreateProduct;
import Domain.Shop.ProductCatalog.Entities.Provider;
import Domain.Shop.ProductCatalog.Events.ProductCreated;
import Domain.Shop.ProductCatalog.Values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CreateProductUseCaseTest {

    @Test
    void createProductEscenary(){
        //arrange
        var provider = new Provider(
                new ProviderId("212"),
                new ProviderName("juan"),
                new Nacionality("colombiano"),
                new Contact("22335255")
        );
        var commmand = new CreateProduct(
                ProductId.of("xxxx"),
                new ProductName("pc"),
                new Price(200000.0),
                new Provider(provider.identity(), provider.ProviderName(), provider.Nacionality(), provider.Contact()),
                new Quantity(3),
                new Width(23.4),
                new Height(12.3),
                new Weight(12.9),
                new Category("tecnologia")
        );
        var useCase = new CreateProductUseCase();

        //act

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(commmand))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (ProductCreated)events.get(0);
        Assertions.assertEquals("pc", event.productName().value());
        Assertions.assertEquals(200000.0, event.price().value());
        Assertions.assertEquals("juan", event.provider().ProviderName().value());
        Assertions.assertEquals(3, event.quantity().value());
        Assertions.assertEquals(23.4, event.width().value());
        Assertions.assertEquals(12.3, event.height().value());
        Assertions.assertEquals(12.9, event.weight().value());
        Assertions.assertEquals("tecnologia", event.category().value());

    }



}