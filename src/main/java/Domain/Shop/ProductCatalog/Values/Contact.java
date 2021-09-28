package Domain.Shop.ProductCatalog.Values;

import co.com.sofka.domain.generic.ValueObject;

public class Contact implements ValueObject<String> {

    private final String contact;

    public Contact(String contact) {
        this.contact = contact;
    }


    @Override
    public String value() {
        return contact;
    }
}
