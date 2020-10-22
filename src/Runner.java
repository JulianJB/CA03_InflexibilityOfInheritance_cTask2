/*
 * This example attempts to show the issue with 
 *	trying to solve the problem by introducing 
 *	sub-class classifiers for 'FlyingDuck', 'NonFlyingDuck' 
 *	(etc.) to the ducks problem?
 *  
 *	Develop a solution to incorporate the 'DecoyDuck'
 *	  class into the inheritance hierarchy and answer the
 *	  question in the _TASK.txt after. 
 */
class Runner {
	public static void main(String[] args) {
		System.out.println("Welcome to the duck show");
		System.out.println("On display today...");
		
		Duck[] ducks = new Duck[] { new MallardDuck()
									, new RedHeadDuck()
									, new RubberDuck()
									, new DecoyDuck()		// ADD: DecoyDuck
									};						// it quacks (as it inherits from Duck)
		System.out.println();								// How to fix that?
		
		demonstrateDucks(ducks);
	}
	
	
	static void demonstrateDucks(Duck[] duckArray) {
		
		for (Duck d : duckArray) {
			d.display();

			// We know for this example that there are only three types of ducks:
			// - QuackingSwimmingFlyingDuck: for mallard ducks and red head ducks
			// - QuackingSwimmingDuck: for rubber ducks
			// - SwimmingDuck: for decoy ducks

			// So, for simplicity, we only check for these three possible combinations, however,
			// we should check for all possible combinations involving the different duck behaviors
			// which should be done by using a switch-case statement and an enum type to avoid
			// a deeply nested if-else statement.

			if (d instanceof QuackingSwimmingFlyingDuck) { // ADDING instanceof to check for object types
				// A QuackingSwimmingFlyingDuck can swim
				System.out.print("\t, then it swims like this: ");
				((QuackingSwimmingFlyingDuck)d).swim(); // the cast is required now though
				// A QuackingSwimmingFlyingDuck can quack
				System.out.print("\t, and makes a ");
				((QuackingSwimmingFlyingDuck)d).quack(); // the cast is required now though
				// A QuackingSwimmingFlyingDuck can fly
				System.out.print("\t, and flys off: ");
				((QuackingSwimmingFlyingDuck)d).fly(); // the cast is required now though
			} else if (d instanceof QuackingSwimmingDuck) {
				// A QuackingSwimmingDuck can swim
				System.out.print("\t, then it swims like this: ");
				((QuackingSwimmingDuck)d).swim(); // the cast is required now though
				// A QuackingSwimmingDuck can quack
				System.out.print("\t, and makes a ");
				((QuackingSwimmingDuck)d).quack(); // the cast is required now though
			} else if (d instanceof SwimmingDuck) {
				// A SwimmingDuck can swim
				System.out.print("\t, then it swims like this: ");
				((SwimmingDuck)d).swim(); // the cast is required now though
			}

			System.out.println();
		}
	}
}