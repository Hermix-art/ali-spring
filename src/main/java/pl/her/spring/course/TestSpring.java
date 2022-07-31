package pl.her.spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

  public static void main(String[] args) {
    // iddzie do xml i zczytuje beany ztamtad
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
    Music bean = context.getBean("musicBean", Music.class);
    MusicPlayer player = new MusicPlayer(bean);
    player.playMusic();
    context.close();
  }
}
