package pl.her.spring.course;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Herman Kulik
 */
@Configuration
@ComponentScan("pl.her.spring.course")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
