package renu.gusain.kafka.playgroud.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import renu.gusain.kafka.playgroud.dto.ProductLocation;

@Service
public class MessageConsumer {

    @KafkaListener(topics = "product-location", groupId = "demo-group")
    public void listen(ProductLocation location) {
        System.out.println("Consumed message: " + location.toString());
    }
}

