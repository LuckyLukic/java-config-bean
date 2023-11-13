package luca.spingboot.javaconfigbeans.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    public CricketCoach() {

        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practicing fast Bowling for 15 minutes ";
    }
}
