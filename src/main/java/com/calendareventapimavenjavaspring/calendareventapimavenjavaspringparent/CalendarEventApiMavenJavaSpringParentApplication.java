package com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models.Calendar;

@SpringBootApplication
public class CalendarEventApiMavenJavaSpringParentApplication {
  private static final Logger log = LoggerFactory.getLogger(CalendarEventApiMavenJavaSpringParentApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CalendarEventApiMavenJavaSpringParentApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
	//		Calendar calendar = restTemplate.getForObject(
//					"https://calendar.apps.pcfone.io/api", Calendar.class);
			log.info("Application started with args" + args);
		};
	}
}
