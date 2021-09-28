package Domain.Shop.ProductCatalog.Commands;

import Domain.Shop.ProductCatalog.Entities.Provider;
import co.com.sofka.domain.generic.Command;

public class UpdateProvider implements Command {

    private final Provider provider;

    public UpdateProvider(Provider provider) {
        this.provider = provider;
    }

    public Provider provider(){
        return provider;
    }
}
