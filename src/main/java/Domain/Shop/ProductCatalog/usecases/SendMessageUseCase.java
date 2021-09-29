package Domain.Shop.ProductCatalog.usecases;

import Domain.Shop.ProductCatalog.Events.AlertSended;
import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;

public class SendMessageUseCase extends UseCase<TriggeredEvent<AlertSended>, ResponseEvents> {




    @Override
    public void executeUseCase(TriggeredEvent<AlertSended> alertSendedTriggeredEvent) {
        var event = alertSendedTriggeredEvent.getDomainEvent();
        var service = getService(SendMessageService.class).orElseThrow();
        var ok = service.sendMessage("3222451244", "Cantidad erronea", "Se ha creado un correo con" +
                "una cantidad de 0");
        if (!ok){
            emit().onError(new BusinessException(
                    event.aggregateRootId(),
                    "No se logró crear algo"
            ));
        }

    }
}
