/*
 * New class: FlyingDuck can fly()
 *	intention: subclass this if you need to fly()
 *			else
 *  			subclass Duck
 */
abstract class FlyingDuck extends Duck { // Not being used, created to demonstrate class explosion in Java

	// As in Java inheritance is constrained to one super class,
	// it is required to duplicate the fly() method for every
	// possible combination of Duck type that involves a fly behavior.
	void fly() {
		System.out.println("<<" + this.getClass().getName() + " fly style>>");
	}
}