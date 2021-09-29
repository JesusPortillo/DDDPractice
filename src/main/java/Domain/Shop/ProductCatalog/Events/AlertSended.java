package Domain.Shop.ProductCatalog.Events;

import co.com.sofka.domain.generic.DomainEvent;

public class AlertSended extends DomainEvent {

    private final String message;
    public AlertSended(String message) {
        super("Domain.Shop.ProductCatalog.AlertSended");
        this.message = message;
    }

    public String Message() {
        return message;
    }
}
