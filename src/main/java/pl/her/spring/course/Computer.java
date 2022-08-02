package pl.her.spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Herman Kulik
 */
@Component
public class Computer {

    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id = 1;
    }

    public String runPlayer(MusicGenre musicGenre) {
        return musicPlayer.playMusic(musicGenre) + " id: " + id;
    }
}
