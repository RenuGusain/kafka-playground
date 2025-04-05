package renu.gusain.kafka.playgroud.config;



import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic productLocationTopic() {
        return new NewTopic("product-location", 3, (short) 3); // 3 partitions, RF 3
    }
}

