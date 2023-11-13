package luca.spingboot.javaconfigbeans.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {


    public TrackCoach() {

        System.out.println("Inconstructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }
}
