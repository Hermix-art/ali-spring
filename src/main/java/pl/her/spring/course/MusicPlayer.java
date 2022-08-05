package pl.her.spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:musicPlayer.properties")
public class MusicPlayer {

    private Music music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music) {
        this.music = music;
    }

    public String playMusic() {
        return String.format("Playing the music %s", music.getSong()) + "\nname and volume: " + name + " " + volume;
    }

}
