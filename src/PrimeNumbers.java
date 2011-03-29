import java.util.ArrayList;


public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimeNumbers(int i) 
	{
		ArrayList<Integer> Primes = new ArrayList<Integer>(); 
		for(int x = 2; x <= i; x++)
		{
			//System.out.println("Looking at " + i + " divided by " + x +" is: " + (i/x)); 
			if ((i%x)==0)
			{
				i = i/x; 
				Primes.add(x); 
				x = 1; 
			}
		}
		return Primes; 
	}

	public static ArrayList<Integer> generator(int i) {
		ArrayList<Integer> Primes = new ArrayList<Integer>();
		for(int x = 2; x < i; x++)
		{
			if(isPrime(x))
			{
				Primes.add(x); 
			}
		}
		return Primes;
	}

/*	private static ArrayList<Integer> generateFactors (int i)
	{
		ArrayList<Integer> Factors = new ArrayList<Integer>();
		for (int x = 1; x < i; x++)
		{
			if ((x % i)==0) 
			{
				Factors.add(i);
			}
		}
		return Factors; 
	}
	
	*/
	private static boolean isPrime (int i)
	{
		for (int x = 1; x < i; x++)
		{
			if ((x%i)==0) return false; 
		}
		return true; 
	}
	
	
}
