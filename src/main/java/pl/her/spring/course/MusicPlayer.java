package pl.her.spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("music.properties")
@Component("musicPlayer")
public class MusicPlayer {

  @Value("${music.volume}")
  private String volume;
  private final Music classicalMusic;
  private final Music rockMusic;

  @Autowired
  public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
      @Qualifier("rockMusic") Music rockMusic) {
    this.classicalMusic = classicalMusic;
    this.rockMusic = rockMusic;
  }

  public void playMusic() {
    System.out.printf("playing %s and %s music, with volume %s", classicalMusic.getSong(),
        rockMusic.getSong(), volume);
  }

}
