import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeNumbersTest {

	@Test
	public void testOne(){
		assertEquals(new ArrayList<Integer>(), PrimeNumbers.generatePrimeNumbers(1));
	}	
	
	@Test
	public void testTwo(){
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(2);
		assertEquals(test, PrimeNumbers.generatePrimeNumbers(2));
		
	}
	
	
	
	
	
	
	
	
}
