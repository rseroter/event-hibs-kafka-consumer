package seroter.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
@SpringBootApplication
public class EventHubsKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventHubsKafkaConsumerApplication.class, args);
	}

	@StreamListener(target=Sink.INPUT)
	public void logMessages(String msg) {
		System.out.println("message is: " + msg);
	}
}
