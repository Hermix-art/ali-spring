package pl.her.spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        // iddzie do xml i zczytuje beany ztamtad
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player.getName());
        System.out.println(player.getVolume());

        ClassicalMusic classicalMusic = context.getBean("someClassicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2  = context.getBean("someClassicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic);
        System.out.println(classicalMusic2);
        context.close();
    }
}
