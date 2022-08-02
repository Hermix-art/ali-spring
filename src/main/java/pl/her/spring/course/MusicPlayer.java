package pl.her.spring.course;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Random random;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("someClassicalMusic") ClassicalMusic classicalMusic,
            @Qualifier("someRockMusic") RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.random = new Random();
    }

    public String playMusic(MusicGenre musicGenre) {
        int nextSong = random.nextInt(3);
        switch (musicGenre) {
            case ROCK:
                return rockMusic.getSongs()[nextSong];
            case CLASSICAL:
                return classicalMusic.getSongs()[nextSong];
        }
        return "";
    }

}
