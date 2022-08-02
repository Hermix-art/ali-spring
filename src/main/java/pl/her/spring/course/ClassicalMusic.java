package pl.her.spring.course;

import java.util.Arrays;
import org.springframework.stereotype.Component;

@Component("someClassicalMusic")
public class ClassicalMusic implements Music {

    String[] songs = {"Sonata nr1","Hungarian Rhapsody","Summer (by Mozart)"};

    @Override
    public String[] getSongs() {
        return Arrays.copyOf(songs, songs.length);
    }
}
