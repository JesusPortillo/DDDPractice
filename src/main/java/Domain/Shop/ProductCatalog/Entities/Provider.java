package Domain.Shop.ProductCatalog.Entities;

import Domain.Shop.ProductCatalog.Values.Contact;
import Domain.Shop.ProductCatalog.Values.Nacionality;
import Domain.Shop.ProductCatalog.Values.ProviderId;
import Domain.Shop.ProductCatalog.Values.ProviderName;
import co.com.sofka.domain.generic.Entity;

public class Provider extends Entity<ProviderId> {

    protected ProviderName providerName;
    protected Nacionality nacionality;
    protected Contact contact;


    public Provider(ProviderId entityId, ProviderName providerName, Nacionality nacionality, Contact contact) {
        super(entityId);
        this.providerName = providerName;
        this.nacionality = nacionality;
        this.contact = contact;
    }

    public ProviderName ProviderName() {
        return providerName;
    }

    public void setProviderName(ProviderName providerName) {
        this.providerName = providerName;
    }

    public Nacionality Nacionality() {
        return nacionality;
    }

    public void setNacionality(Nacionality nacionality) {
        this.nacionality = nacionality;
    }

    public Contact Contact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void updateContact(Contact contact){
        setContact(contact);
    }
}
