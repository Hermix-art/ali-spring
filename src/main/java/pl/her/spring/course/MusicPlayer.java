package pl.her.spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
  private Music music;

  public Music getMusic() {
    return music;
  }

  @Autowired
  public void setMusic(Music music) {
    this.music = music;
  }

  public MusicPlayer(Music music) {
    this.music = music;
  }

  public void playMusic() {
    System.out.printf("Playing the %s music", music.getSong());
  }

}
