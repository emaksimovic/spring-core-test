package demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by maxa on 12/16/2017.
 */
@Component("theCoach")
public class CricketCoach implements Coach {

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;
    @Value("${foo.name}")
    private String name;
    @Value("${foo.email}")
    private String email;

    CricketCoach() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "fast balling 15min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
