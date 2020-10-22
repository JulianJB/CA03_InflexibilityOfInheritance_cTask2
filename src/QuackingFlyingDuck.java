// For a type of duck that can quack and fly
abstract class QuackingFlyingDuck extends Duck { // Not being used, created to demonstrate class explosion in Java

    // As in Java inheritance is constrained to one super class,
    // it is required to duplicate the quack() method for every
    // possible combination of Duck type that involves a quack behavior.
    void quack() {
        System.out.println("<<" + this.getClass().getName() + " quack sound>>");
    }

    // As in Java inheritance is constrained to one super class,
    // it is required to duplicate the fly() method for every
    // possible combination of Duck type that involves a fly behavior.
    void fly() {
        System.out.println("<<" + this.getClass().getName() + " fly style>>");
    }
}