package demo2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by maxa on 12/17/2017.
 */
@Component
public class FileFortuneService implements FortuneService {

    private List<String> fortunes;

    @PostConstruct
    public void readFortunesFromFile() {
        fortunes = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get("src/main/resources/fortunes.txt"))) {
            stream.forEach(f -> fortunes.add(f));
        } catch(IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    @Override
    public String getFortune() {
        return fortunes.get(new Random().nextInt(fortunes.size()));
    }
}
