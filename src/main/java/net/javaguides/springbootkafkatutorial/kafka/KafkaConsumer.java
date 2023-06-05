package net.javaguides.springbootkafkatutorial.kafka;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



import static org.springframework.kafka.listener.ConsumerAwareRebalanceListener.LOGGER;

@Service
public class KafkaConsumer {

    private static final Logger LOGGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "javaguides", groupId = "myGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Message recieved -> %s", message));

    }


}
