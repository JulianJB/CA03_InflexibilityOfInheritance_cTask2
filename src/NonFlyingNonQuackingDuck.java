// For a type of duck that cannot fly or quack
// Example: a decoy duck
abstract class NonFlyingNonQuackingDuck extends Duck { // Not being used, alternative to class explosion
                                                       // when you can constrain the behavior types

    // Overrides the quack method of the Duck superclass to indicate
    // that a class that inherits from this class cannot quack.
    // No longer used since quack() method was removed from the Duck super class
    // @Override
    void quack() {
        System.out.println("<<NonFlyingNonQuackingDuck.quack(): can't quack>>");
    }
}