package pl.her.spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

  public static void main(String[] args) {
    // iddzie do xml i zczytuje beany ztamtad
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
    Music rockMusic = context.getBean("someRockMusic", RockMusic.class);
    Music classicalMusic = context.getBean("someClassicalMusic", ClassicalMusic.class);
    System.out.println(rockMusic.getSong());
    System.out.println(classicalMusic.getSong());

    context.close();
  }
}
