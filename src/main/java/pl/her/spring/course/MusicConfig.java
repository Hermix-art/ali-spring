package pl.her.spring.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class MusicConfig {

  @Bean
  public Music classicalMusic() {
    return new ClassicalMusic();
  }

  @Bean
  public Music jazzMusic() {
    return new JazzMusic();
  }

  @Bean
  public Music rockMusic() {
    return new RockMusic();
  }

  @Bean
  public List<Music> getMusic() {
    return new ArrayList<>(Arrays.asList(rockMusic(), classicalMusic(), jazzMusic()));
  }

  @Bean
  public MusicPlayer musicPlayer() {
    return new MusicPlayer(getMusic());
  }

}
