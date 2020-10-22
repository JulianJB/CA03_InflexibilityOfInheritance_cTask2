// For a type of duck that can swim
// Example: a decoy duck
abstract class SwimmingDuck extends Duck {

    // As in Java inheritance is constrained to one super class,
    // it is required to duplicate the swim() method for every
    // possible combination of Duck type that involves a swim behavior.
    void swim() {
        System.out.println("<<" + this.getClass().getName() + " swim style>>");
    }
}