package org.redhat.demo.amqpdemo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class AMQPSenderRoute extends RouteBuilder{

    @Override
    public void configure() throws Exception {
    
        from("timer:amqptimer?period=1000")
        .setBody(constant("Hello World"))
        .to("amqp:queue:TEST")
        .end();
        
    }
    
}
