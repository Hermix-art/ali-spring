package pl.her.spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired
    @Qualifier("someRockMusic")
    private Music music;

//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//}

    public String playMusic() {
        return String.format("Playing the music %s", music.getSong());
    }

}
