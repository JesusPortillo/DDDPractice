package Domain.Shop.ProductCatalog.usecases;

public interface SendMessageService {

    Boolean sendMessage(String destiny, String subject, String message);
}
