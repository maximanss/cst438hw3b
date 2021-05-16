package cst438hw3b.configuration;

/**
 * This class will configure the application to receive for any message from the Rabbit queue
 *  which is connected with Rabbit fanout exchange - "city-reservation"
 *  
 */
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cst438hw3b.listener.ReservationEventHandler;

@Configuration
public class ConfigReceiver {
    @Bean
    public FanoutExchange fanout() {
        return new FanoutExchange("city-reservation");
    }
    @Bean
    public Queue queue1() {
        return new Queue("city-reservation-q1");
    }
    @Bean
    public Binding binding1(FanoutExchange fanout, Queue queue1) {
        return BindingBuilder.bind(queue1).to(fanout);
    }
    @Bean
    public ReservationEventHandler receiver() {
        return new ReservationEventHandler();
    }
}
