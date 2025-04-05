package renu.gusain.kafka.playgroud.producer;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import renu.gusain.kafka.playgroud.dto.ProductLocation;

@Service
public class ProductLocationProducer {

    private final KafkaTemplate<String, ProductLocation> kafkaTemplate;

    public ProductLocationProducer(KafkaTemplate<String, ProductLocation> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendLocation(ProductLocation location) {
        kafkaTemplate.send("product-location", location.getProductId(), location);
    }
}

