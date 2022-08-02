package pl.her.spring.course;

import java.util.Arrays;
import org.springframework.stereotype.Component;

@Component("someRockMusic")
public class RockMusic implements Music {

    String[] songs = {"Smells like teen spirit", "Enter sandman", "Have a cigar"};

    @Override
    public String[] getSongs() {
        return Arrays.copyOf(songs, songs.length);
    }

}
