package com.cognizant.Spring_learn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringLearnApplication.class, args);

		displayDate();
		displayCountry();
		displayCountries();
	}

	public static void displayDate() throws Exception {
		LOGGER.info("START displayDate");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat sdf = context.getBean("dateFormat", SimpleDateFormat.class);
		Date date = sdf.parse("31/12/2018");
		LOGGER.debug("Date: {}", date.toString());
		LOGGER.info("END displayDate");
	}

	public static void displayCountry() {
		LOGGER.info("START displayCountry");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country", Country.class);
		LOGGER.debug("Country: {}", country.toString());

		Country country1 = context.getBean("country", Country.class);
		Country country2 = context.getBean("country", Country.class);

		LOGGER.debug("Country1: {}", country1);
		LOGGER.debug("Country2: {}", country2);
		LOGGER.info("END displayCountry");
	}

	public static void displayCountries() {
		LOGGER.info("START displayCountries");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> list = context.getBean("countryList", ArrayList.class);

		for (Country c : list) {
			LOGGER.debug("Country: {}", c.toString());
		}

		LOGGER.info("END displayCountries");
	}
}
