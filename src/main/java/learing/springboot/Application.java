package learing.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learing.springboot.Schedule.ScheduleConfig;

@SpringBootApplication
public class Application {

	private static AnnotationConfigApplicationContext annotationConfigApplicationContext;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ScheduleConfig.class);
	}

	public static AnnotationConfigApplicationContext getAnnotationConfigApplicationContext() {
		return annotationConfigApplicationContext;
	}

	public static void setAnnotationConfigApplicationContext(AnnotationConfigApplicationContext annotationConfigApplicationContext) {
		Application.annotationConfigApplicationContext = annotationConfigApplicationContext;
	}
}
