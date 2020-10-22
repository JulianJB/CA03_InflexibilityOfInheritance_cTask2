/*
 * Removed the fly() method here, that is now pushed down
 * to the FlyingDuck class.
 */

abstract class Duck {

    Duck() {
        System.out.println(" a " + this.getClass().getName());
    }

    // We have pushed the quack() method down to the corresponding:
    // QuackingDuck,
    // QuackingFlyingDuck,
    // QuackingSwimmingDuck,
    // QuackingSwimmingFlyingDuck classes

    // We have pushed the swim() method down to the corresponding:
    // SwimmingDuck,
    // SwimmingFlyingDuck,
    // QuackingSwimmingDuck,
    // QuackingSwimmingFlyingDuck classes

    // We have pushed the fly() method down to the corresponding:
    // FlyingDuck,
    // QuackingFlyingDuck,
    // SwimmingFlyingDuck,
    // QuackingSwimmingFlyingDuck classes

    // Force sub-classes to implement a display() method
    abstract void display();
}