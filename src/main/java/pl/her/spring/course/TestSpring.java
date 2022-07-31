package pl.her.spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

  public static void main(String[] args) {
    // iddzie do xml i zczytuje beany ztamtad
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
    MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
    player1.playMusic();
    MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);

    System.out.println(player1);
    System.out.println(player2);
    System.out.println("Object are equal?");
    System.out.println(player1 == player2);

    player1.setVolume(100);

    System.out.println(player1.getVolume());
    System.out.println(player2.getVolume());

    context.close();
  }
}
