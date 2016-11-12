package dogstuff;

public class TestDog {

	public static void main(String[] args) {
		
		Dog      myDog1     = new Dog();
		Dog      myDog2     = new Dog(Dog.BREED.POODLE, Dog.FURCOLOR.BLACK, Dog.FURLENGTH.MEDIUM);
        FancyDog myFancyDog = new FancyDog(Dog.BREED.TERRIER, Dog.FURCOLOR.WHITE, Dog.FURLENGTH.SHORT, FancyDog.OUTFIT.NONE);
        
        System.out.println (                        " myDog1 is of breed " + 
                            myDog1.getBreed()     + " and fur color " + 
        		            myDog1.getFurColor()  + " and fur length " +
                            myDog1.getFurLength() + " with lic # " +
        		            myDog1.getLicNum()    + " .");
        
        System.out.println (                        " myDog2 is of breed " + 
                            myDog2.getBreed()     + " and fur color " + 
	                        myDog2.getFurColor()  + " and fur length " +
                            myDog2.getFurLength() + " with lic # " +
                            myDog2.getLicNum()    + " .");
        
        System.out.println (                            " myFancyDog is of breed " + 
                            myFancyDog.getBreed()     + " and fur color " + 
                            myFancyDog.getFurColor()  + " and fur length " +
                            myFancyDog.getFurLength() + " and outfit " +
                            myFancyDog.getOutfit()    + " with lic # " +
                            myFancyDog.getLicNum()    + " .");
        
        myFancyDog.doTrick();
        myFancyDog.putOnOutfit(FancyDog.OUTFIT.PUMPKIN);
        myFancyDog.doTrick();
	}

}
