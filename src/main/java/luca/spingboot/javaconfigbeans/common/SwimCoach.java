package luca.spingboot.javaconfigbeans.common;

public class SwimCoach implements Coach{
    public SwimCoach() {

        System.out.println("In constructor: " +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000m as warm up";
    }
}
