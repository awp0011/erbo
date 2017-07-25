package learing.springboot.Schedule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class ScheduleConfig {
	
    @Bean
    public MyFirstSchedule task() {
        return new MyFirstSchedule();
    }
}
