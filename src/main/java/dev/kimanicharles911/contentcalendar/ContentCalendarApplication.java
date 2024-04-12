package dev.kimanicharles911.contentcalendar;
//package dev.kimanicharles911.contentcalendar.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ContentCalendarApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(ContentCalendarApplication.class, args);
		RestTemplate restTemplate = (RestTemplate) context.getBean("restTemplate");
		System.out.println(restTemplate);
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
