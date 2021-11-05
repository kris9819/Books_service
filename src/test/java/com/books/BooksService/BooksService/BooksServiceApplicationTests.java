package com.books.BooksService.BooksService;

import com.rabbitmq.client.*;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.hamcrest.Matchers.contains;

@SpringBootTest
class BooksServiceApplicationTests {

	@Test
	void checkSize() throws NoSuchAlgorithmException, KeyManagementException, IOException, TimeoutException, InterruptedException {
		ConnectionFactory factory = new ConnectionFactory();

		factory.setUsername("KrzychuDzik");
		factory.setPassword("TestPasswd123");

		factory.setHost("b-c2d9196a-9a6a-492e-97e2-6fa4a8194d98.mq.us-east-2.amazonaws.com");
		factory.setPort(5671);
		factory.useSslProtocol();

		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
		List<String> messages = new ArrayList<>();

		channel.basicConsume("FirstQueue", false, "KrzychuDzik",
				new DefaultConsumer(channel) {
					@Override
					public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
						String routingKey = envelope.getRoutingKey();
						String contentType = properties.getContentType();
						long deliveryTag = envelope.getDeliveryTag();
						messages.add(new String(body, StandardCharsets.UTF_8));
						channel.basicAck(deliveryTag, false);
					}
				});

		TimeUnit.MILLISECONDS.sleep(200L);
		Assert.assertEquals(1, messages.size());
	}

	@Test
	void checkLoad() throws NoSuchAlgorithmException, KeyManagementException, IOException, TimeoutException, InterruptedException {
		ConnectionFactory factory = new ConnectionFactory();

		factory.setUsername("KrzychuDzik");
		factory.setPassword("TestPasswd123");

		factory.setHost("b-c2d9196a-9a6a-492e-97e2-6fa4a8194d98.mq.us-east-2.amazonaws.com");
		factory.setPort(5671);
		factory.useSslProtocol();

		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
		List<String> messages = new ArrayList<>();

		channel.basicConsume("FirstQueue", false, "KrzychuDzik",
				new DefaultConsumer(channel) {
					@Override
					public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
						String routingKey = envelope.getRoutingKey();
						String contentType = properties.getContentType();
						long deliveryTag = envelope.getDeliveryTag();
						messages.add(new String(body, StandardCharsets.UTF_8));
						channel.basicAck(deliveryTag, false);
					}
				});

		TimeUnit.MILLISECONDS.sleep(200L);
		Assert.assertThat(messages, contains("random msg"));
	}
}
