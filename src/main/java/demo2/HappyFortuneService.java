package demo2;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by maxa on 12/15/2017.
 */
@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        List<String> fortunes = Arrays.asList("Fortune1", "Fortune2", "Fortune3");
        //return fortunes.get(0 + (int)(Math.random() * 2));
        return fortunes.get((new Random()).nextInt(fortunes.size()));
    }
}
