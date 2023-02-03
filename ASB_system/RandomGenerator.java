package ASB_system;
//Class to generate random numbers between a specified range
public class RandomGenerator {
	// Method to get a random value within a given range
	public int getRandomValue(int min,int max)
	{
		// Generate a random number between min and max using Math.random() method
		int randomNum=(int)(Math.random()*(max-min))+min;
		// Return the generated random number
		return randomNum;
	}

}
