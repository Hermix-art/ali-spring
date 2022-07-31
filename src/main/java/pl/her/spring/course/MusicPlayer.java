package pl.her.spring.course;

public class MusicPlayer {

  private String city;
  private Music music;
  private String name;
  private int volume;

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public MusicPlayer() {
  }

  //Ioc
  public MusicPlayer(Music music) {
    this.music = music;
  }

  public void setMusic(Music music) {
    this.music = music;
  }

  public void playMusic() {
    System.out.println(
        String.format("band %s is playing song %s with volume %s. Band is from %s", getName(),
            music.getSong(),
            getVolume(), getCity()));
  }

}
