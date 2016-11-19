package dogstuff;

public class Dog {

	/*
	 *  Define some attributes of a dog.
	 */
	
	public enum BREED     {POODLE, SPANIEL, TERRIER, MUTT, UNKNOWN};
	public enum FURCOLOR  {BLACK, WHITE, MIXED, UNKNOWN};
	public enum FURLENGTH {SHORT, MEDIUM, LONG, UNKNOWN};

	/*
	 *  Declare non-static variables to hold the attributes.  Each of these variables exists
	 *  for each Dog object that is created.
	 */

	private BREED     m_breed;
	private FURCOLOR  m_furColor;
	private FURLENGTH m_furLength;
	private int       m_licenseNumber;
	
	/*  Define a static variable used to generate a unique pet license number (starting at 1000).
	 *  Only one instance of this variable exists no matter how many Dog objects are created.
	 */ 
	private static int nextLicenseNum = 999;

	
	/*
	 * Dog constructors
	 */
	
	Dog () {
		// We know nothing about this dog.
		// Example object creation: Dog myDog1 = new Dog();
		m_breed         = BREED.UNKNOWN;
		m_furColor      = FURCOLOR.UNKNOWN;
		m_furLength     = FURLENGTH.UNKNOWN;
		m_licenseNumber = GenerateLicenseNumber();	
	}
	
	Dog (BREED breed, FURCOLOR color, FURLENGTH length) {
		// We know everything about this dog.
		// Example object creation: Dog myDog2 = new Dog(Dog.BREED.POODLE, Dog.FURCOLOR.BLACK, Dog.FURLENGTH.MEDIUM);
		m_breed         = breed;
		m_furColor      = color;
		m_furLength     = length;
		m_licenseNumber = GenerateLicenseNumber();		
	}
	
	private int GenerateLicenseNumber () {
		nextLicenseNum++;		// Increment the unique license number and return it to the caller.
		return nextLicenseNum;
	}
	
	/*
	 * Dog methods
	 */
		
	public String getBreed     () { return m_breed.name(); }
	
	public String getFurColor  () { return m_furColor.name(); }
	
	public String getFurLength () {	return m_furLength.name(); }
	
	public int    getLicNum    () { return m_licenseNumber; }
	
	public void   bark         () {	System.out.println("Bark, bark, bark!"); }
	
}