package pl.her.spring.course;

import org.springframework.stereotype.Component;

@Component("someRockMusic")
public class RockMusic implements Music {

  @Override
  public String getSong() {
    return "Wind cries Mary";
  }

}
