package com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent;

import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models.Calendar;
import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models.CalendarRepository;
import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models.CalendarEvent;
import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models.CalendarEventRepository;

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

	//@Bean
	//public CommandLineRunner init(CalendarRepository repository) {
	//	return args -> {
	//		repository.save(new Calendar(12345678910L, "Calendar1"));
	//	};
	//}

	//new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2017-07-21 09:00:00")
	// to
	// LocalDateTime.of(2022, 07, 21, 9, 0, 0)
	//@Bean
	//public CommandLineRunner init(CalendarEventRepository repository) {
	//	return args -> {
	//		repository.save(new CalendarEvent(57493728710L, "Daily Standup", LocalDateTime.of(2022, 07, 21, 9, 0, 0), 15, "Meeting Room1")); 
	//	};
	//}

	//@Bean
	//public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
	//	return args -> {
	//		Calendar calendar = restTemplate.getForObject(
//					"https://calendar.apps.pcfone.io/api", Calendar.class);
	//		log.info("Application started with args" + args);
	//	};
	//}
}
