package pl.her.spring.course;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("someClassicalMusic")
@Scope("prototype")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
