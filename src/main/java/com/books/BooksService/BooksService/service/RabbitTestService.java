package com.books.BooksService.BooksService.service;

import com.rabbitmq.client.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

@Service
public class RabbitTestService {

    public void consumeMsg() throws IOException, TimeoutException, NoSuchAlgorithmException, KeyManagementException {
        ConnectionFactory factory = new ConnectionFactory();

        factory.setUsername("KrzychuDzik");
        factory.setPassword("TestPasswd123");

        factory.setHost("b-c2d9196a-9a6a-492e-97e2-6fa4a8194d98.mq.us-east-2.amazonaws.com");
        factory.setPort(5671);
        factory.useSslProtocol();

        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.basicConsume("FirstQueue", false, "KrzychuDzik",
                new DefaultConsumer(channel) {
                    @Override
                    public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                        String routingKey = envelope.getRoutingKey();
                        String contentType = properties.getContentType();
                        long deliveryTag = envelope.getDeliveryTag();
                        String str = new String(body, StandardCharsets.UTF_8);
                        System.out.println(str);
                        channel.basicAck(deliveryTag, false);
                    }
                });
    }
}
