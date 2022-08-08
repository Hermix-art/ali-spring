package pl.her.spring.course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

  public static void main(String[] args) {
    // iddzie do xml i zczytuje beany ztamtad
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MusicConfig.class);
    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    musicPlayer.playMusic();
    context.close();

  }
}
