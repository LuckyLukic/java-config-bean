package luca.spingboot.javaconfigbeans.common;

import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // to create multi beans
public class CricketCoach implements Coach{


    public CricketCoach() {

        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // define our init method
    // @PostConstruct
    // public void doMyStartupStuff() {
    //    System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    // }

    // define our destroy method
    // @PreDestroy
    // public void doMyCleanupStuff() {
    //    System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    // }

    @Override
    public String getDailyWorkout() {
        return "Practicing fast Bowling for 15 minutes ";
    }
}
