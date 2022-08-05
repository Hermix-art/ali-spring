package pl.her.spring.course;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classicalMusic")
@Scope("singleton")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void printInTheBeginning(){
        System.out.println("hello guys, let's start from classical music!");
    }

    @PreDestroy
    void youWannaDestroyMe(){
        System.out.println("It's destruction time, babe (from classical music)!");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
