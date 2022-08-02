package pl.her.spring.course;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music{

  @Override
  public String getSong() {
    return "Hungarian Rhapsody";
  }
}
