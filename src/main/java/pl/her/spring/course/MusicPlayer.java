package pl.her.spring.course;

public class MusicPlayer {

  private Music music;

  //Ioc
  public MusicPlayer(Music music) {
    this.music = music;
  }

  public void playMusic() {
    System.out.println("playing song:" + music.getSong());
  }

}
