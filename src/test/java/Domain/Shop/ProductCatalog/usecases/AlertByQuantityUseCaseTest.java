package Domain.Shop.ProductCatalog.usecases;

import Domain.Shop.ProductCatalog.Entities.Provider;
import Domain.Shop.ProductCatalog.Events.AlertSended;
import Domain.Shop.ProductCatalog.Events.ProductCreated;
import Domain.Shop.ProductCatalog.Values.*;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AlertByQuantityUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    void alertByMessageIsValidTheCondition(){
        // arrange
        var aggregateId = "xx-xx";
        var event = new ProductCreated(new ProductName("pc"), new Price(0.0),
                new Provider(new ProviderId("ssw"),new ProviderName("s"),
                        new Nacionality("swsw"),new Contact("sw")), new Quantity(0), new Width(12.0),
                new Height(12.8), new Weight(21.2), new Category("tecnologia"));
        event.setAggregateRootId(aggregateId);
        var useCase = new AlertByQuantityUseCase();

        Mockito.when(repository.getEventsBy(aggregateId)).thenReturn(eventStored());
        useCase.addRepository(repository);

        // act
        var events = UseCaseHandler.getInstance().setIdentifyExecutor(aggregateId).
                syncExecutor(useCase, new TriggeredEvent<>(event)).orElseThrow().getDomainEvents();

        //assert
        var messageSended = (AlertSended)events.get(0);

        Assertions.assertEquals("No deberías agregar un producto con cantidad 0", messageSended.Message());
        Mockito.verify(repository).getEventsBy(aggregateId);
    }

    private List<DomainEvent> eventStored() {
        var event = new ProductCreated(new ProductName("pc"), new Price(0.0),
                new Provider(new ProviderId("ssw"),new ProviderName("s"),
                        new Nacionality("swsw"),new Contact("sw")), new Quantity(0), new Width(12.0),
                new Height(12.8), new Weight(21.2), new Category("tecnologia"));

        return List.of(event);
    }
}