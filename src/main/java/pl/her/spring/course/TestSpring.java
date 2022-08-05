package pl.her.spring.course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        System.out.println("=====================");

        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player1.playMusic());
        System.out.println("=====================");

        // as classicalMusic is a singleton, initial method won't be called one more time, but destroy method will be called
        Music classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        //as rockmusic is a prototype - initial method will be called 2nd time, and no pre-destroy method will be called
        Music rockMusic = context.getBean("rockMusic", RockMusic.class);

        context.close();
    }
}
