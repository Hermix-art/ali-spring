package pl.her.spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        // iddzie do xml i zczytuje beany ztamtad
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.runPlayer(MusicGenre.ROCK));
        System.out.println(computer.runPlayer(MusicGenre.CLASSICAL));
        context.close();
    }
}
