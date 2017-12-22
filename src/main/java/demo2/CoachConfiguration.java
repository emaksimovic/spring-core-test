package demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by maxa on 12/14/2017.
 */
@Configuration
@ComponentScan("demo2")
@PropertySource("classpath:sport.properties")
public class CoachConfiguration {

    /*@Bean
    FortuneService fortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    Coach theCoach() {
        return new CricketCoach();
    }*/
}
