package luca.spingboot.javaconfigbeans.config;

import luca.spingboot.javaconfigbeans.common.Coach;
import luca.spingboot.javaconfigbeans.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
