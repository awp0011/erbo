package learing.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learing.springboot.Schedule.ScheduleConfig;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
	}
}
