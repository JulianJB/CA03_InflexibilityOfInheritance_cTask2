1) why/how inheritance can be inflexible

In Java the concept of inheritance can be considered inflexible due to the fact that one subclass can only
extend from one superclass at a time, therefore, you cannot inherit different attributes and behaviors
from many classes at the same time.

This is not convenient where you have a subtype that shares behaviors from two or more types.

Take a look at this part of the code of the DecoyDuck and the RubberDuck classes:

class DecoyDuck extends SwimmingDuck { // a DecoyDuck can swim

class RubberDuck extends QuackingDuck, SwimmingDuck { // ideally this would be the perfect scenario

But it is not the case as this is not possible to do in a programming language like Java. So instead,
it is done like this:

class RubberDuck extends QuackingSwimmingDuck { // a RubberDuck can quack and swim

Which will end up leading to a problem known as 'class explosion'.

2) mention _and explain_ what an 'exploding class hierarchy' or 'class explosion' is

Exploding class hierarchy, also known as class explosion or combinatorial explosion, as Wikipedia suggests,
is the rapid growth of the complexity of a problem, which refers to when the class hierarchy of a program
is growing exponentially and therefore, becoming unmanageable. This is caused usually by bad design practices,
such as designing classes based on their attributes instead of their functionality.

Take a look at part of the class hierarchy of this program:

- Class Duck
- Class FlyingDuck
- Class SwimmingDuck
- Class QuackingDuck
- Class SwimmingFlyingDuck
- Class QuackingFlyingDuck
- Class QuackingSwimmingDuck
- Class QuackingSwimmingFlyingDuck

Look at how a relatively simple problem where there was only three behaviors (fly, swim, and quack) can
derive on a excessively complicated and unmanageable hierarchy of classes by introducing classifiers into
the type hierarchy, ending up with a total of 7 classes for all 7 possible combinations. Problems that
involve a greater number of behaviors will increase the complexity of the class hierarchy exponentially.

3) Give an example showing how repeating code can result from such a design

If the previous scenario was not bad enough another problem of the exploding class hierarchy approach
is that it would end up with lots of repeating code among the classes.

Take a look at this part of the code of the QuackingSwimmingDuck and the QuackingSwimmingFlyingDuck classes:

abstract class QuackingSwimmingDuck extends Duck {
    void quack() {
        System.out.println("<<" + this.getClass().getName() + " quack sound>>");
    }

    void swim() {
        System.out.println("<<" + this.getClass().getName() + " swim style>>");
    }
}

abstract class QuackingSwimmingFlyingDuck extends Duck {
    void quack() {
        System.out.println("<<" + this.getClass().getName() + " quack sound>>");
    }

    void swim() {
        System.out.println("<<" + this.getClass().getName() + " swim style>>");
    }

    void fly() {
        System.out.println("<<" + this.getClass().getName() + " fly style>>");
    }
}

As it can be seen, the code for the methods quack() and swim() in both classes is the same, which goes
against the DRY (Don't Repeat Yourself) principle as we would have to be repeating code over and over again
for all of the classes that implement any of those behaviors.