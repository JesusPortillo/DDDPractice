package Domain.Shop.ProductCatalog.Events;

import Domain.Shop.ProductCatalog.Entities.Provider;
import Domain.Shop.ProductCatalog.Values.ProductName;
import co.com.sofka.domain.generic.DomainEvent;

public class ProviderUpdated extends DomainEvent {

    private final Provider provider;

    public ProviderUpdated(Provider provider) {
        super("Domain.Shop.ProductCatalog.ProviderUpdated");
        this.provider = provider;
    }

    public Provider provider(){
        return provider;
    }
}
