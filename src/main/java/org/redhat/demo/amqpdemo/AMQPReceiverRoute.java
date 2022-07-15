package org.redhat.demo.amqpdemo;

import org.apache.camel.BeanInject;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.amqp.AMQPComponent;
import org.springframework.stereotype.Component;

@Component
public class AMQPReceiverRoute extends RouteBuilder{


    @BeanInject
    AMQPComponent amqpComponent;

    @Override
    public void configure() throws Exception {
        
        from("amqp:queue:TEST")
        .log("${body}")
        .end();
        
    }
    
}
