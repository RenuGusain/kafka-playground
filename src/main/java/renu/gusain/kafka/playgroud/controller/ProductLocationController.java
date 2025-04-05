package renu.gusain.kafka.playgroud.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import renu.gusain.kafka.playgroud.dto.ProductLocation;
import renu.gusain.kafka.playgroud.producer.ProductLocationProducer;

@RestController
@RequestMapping("/products")
public class ProductLocationController {

    private final ProductLocationProducer producer;

    public ProductLocationController(ProductLocationProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/location")
    public String updateLocation(@RequestBody ProductLocation location) {
        producer.sendLocation(location);
        return "Location sent to Kafka for product: " + location.getProductId();
    }
}
