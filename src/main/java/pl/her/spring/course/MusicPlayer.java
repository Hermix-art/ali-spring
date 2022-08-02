package pl.her.spring.course;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
  private ClassicalMusic music;

  @Autowired
  public MusicPlayer(ClassicalMusic music) {
    this.music = music;
  }

  public void playMusic() {
    System.out.printf("Playing the %s music", music.getSong());
  }

}
