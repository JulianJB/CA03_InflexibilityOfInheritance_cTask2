/*  No longer need to override fly().
 *	FlyingDuck now has the fly() method 
 *	and RubberDuck can now just inherit 
 *	swim() and quack()
 */
 class RubberDuck extends QuackingSwimmingDuck { // now extends QuackingSwimmingDuck class
 
	// This is an improvement over the previous version.
	// We're overriding quack to make it "squeak" for the RubberDuck
	@Override
	void quack() {
		System.out.println("<<" + this.getClass().getName() + " squeak sound>>");
	}

	@Override
	void display() {
		System.out.println("RubberDuck floats on the water");
	}
}