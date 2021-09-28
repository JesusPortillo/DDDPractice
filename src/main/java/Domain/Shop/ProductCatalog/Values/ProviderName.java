package Domain.Shop.ProductCatalog.Values;

import co.com.sofka.domain.generic.ValueObject;

public class ProviderName implements ValueObject<String> {

    private final String providerName;


    public ProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Override
    public String value() {
        return providerName;
    }
}
