// For a type of duck that cannot fly or quack
// Example: a decoy duck
abstract class NonFlyingNonQuackingDuck extends Duck {

    // Overrides the quack method of the Duck superclass to indicate
    // that a class that inherits from this class cannot quack.
    @Override
    void quack() {
        System.out.println("<<NonFlyingNonQuackingDuck.quack(): can't quack>>");
    }
}