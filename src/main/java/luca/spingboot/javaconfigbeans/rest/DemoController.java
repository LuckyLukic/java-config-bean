package luca.spingboot.javaconfigbeans.rest;

import luca.spingboot.javaconfigbeans.common.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    public DemoController(@Qualifier("aquatic") Coach theCoach) {

        //to print post construct and pre destroy
        //@Qualifier("cricketCoach") Coach theCoach) {
        //    System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }



    //@Autowired  //this would create 2 different instances hence 2 different memory allocations
    //public DemoController(
    //      @Qualifier("cricketCoach") Coach theCoach,
    //      @Qualifier("cricketCoach") Coach theAnotherCoach) {
    //   System.out.println("In constructor: " + getClass().getSimpleName());
    //    myCoach = theCoach;
    //    anotherCoach = theAnotherCoach;
    // }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
