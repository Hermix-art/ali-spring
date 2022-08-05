package pl.her.spring.course;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rockMusic")
@Scope("prototype")
public class RockMusic implements Music {

    @PostConstruct
    public void printInTheBeginning() {
        System.out.println("hello guys, let's start from rock music!");
    }

    @PreDestroy
    void youWannaDestroyMe() {
        System.out.println("It's destruction time, babe (from rock music)!");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

}
