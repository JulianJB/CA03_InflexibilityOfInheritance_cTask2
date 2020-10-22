// For a type of duck that can quack, swim, and fly
// Example: a mallard duck or a red head duck
abstract class QuackingSwimmingFlyingDuck extends Duck {

    // As in Java inheritance is constrained to one super class,
    // it is required to duplicate the quack() method for every
    // possible combination of Duck type that involves a quack behavior.
    void quack() {
        System.out.println("<<" + this.getClass().getName() + " quack sound>>");
    }

    // As in Java inheritance is constrained to one super class,
    // it is required to duplicate the swim() method for every
    // possible combination of Duck type that involves a swim behavior.
    void swim() {
        System.out.println("<<" + this.getClass().getName() + " swim style>>");
    }

    // As in Java inheritance is constrained to one super class,
    // it is required to duplicate the fly() method for every
    // possible combination of Duck type that involves a fly behavior.
    void fly() {
        System.out.println("<<" + this.getClass().getName() + " fly style>>");
    }
}