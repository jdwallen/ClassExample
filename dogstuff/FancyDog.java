package dogstuff;

public class FancyDog extends Dog {

	/*
	 *  Define some attributes of a fancy dog.
	 */
	
	public enum OUTFIT {PUMPKIN, REINDEER, CUPID, NONE};
	
	/*
	 *  Declare non-static variables to hold the attributes.  Each of these variables exists
	 *  for each FancyDog object that is created.
	 */

	OUTFIT m_outfit;
	
	/*
	 * FancyDog constructors
	 */

	FancyDog () {
		super(); // Call the Dog() constructor.
		m_outfit = OUTFIT.NONE;
	}
	
	FancyDog (BREED breed, FURCOLOR color, FURLENGTH length, OUTFIT outfit){
		super(breed,color,length); // Call the Dog(breed,color,length) constructor.
		m_outfit = outfit;
	}
	
	/*
	 * FancyDog methods
	 */
	
	public void doTrick () {
		
		System.out.print("DOING A TRICK - ");
		
		// This dog can sing a different song depending on which outfit that it is wearing.
		switch (m_outfit) {
		   case PUMPKIN  : System.out.println ("SINGING: 'Thriller, thriller...'");              break;
		   case REINDEER : System.out.println ("SINGING: 'Dashing through the snow...'");        break;
		   case CUPID    : System.out.println ("SINGING: 'You've lost that loving feeling...'"); break;
		   case NONE     : System.out.println ("I'll just play dead.");                          break;
		}

	}
	
	public OUTFIT getOutfit() {
		return m_outfit;
	}
	
	public void putOnOutfit(OUTFIT outfit) {
		m_outfit = outfit;
		System.out.println("Putting on " + outfit.toString() + " outfit.");
	}
	
	public void takeOffOutfit() {
		m_outfit = OUTFIT.NONE;
	}
}
