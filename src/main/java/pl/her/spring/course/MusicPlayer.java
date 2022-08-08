package pl.her.spring.course;

import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {

  private final Random random;
  @Value("${musicPlayer.volume}")
  private String volume;
  private List<Music> musicList;

  public MusicPlayer(List<Music> musicList) {
    this.musicList = musicList;
    this.random = new Random();
  }

  public void playMusic() {
    System.out.printf("player plays %s music with volume %s", getRandomSong(), volume);
  }

  private String getRandomSong() {
    return musicList.get(random.nextInt(musicList.size())).getSong();
  }

}
