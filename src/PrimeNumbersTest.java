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
	@Test
	public void testThree(){
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(3);
		assertEquals(test, PrimeNumbers.generatePrimeNumbers(3));
		
	}

	@Test
	public void testFour()
	{
		ArrayList<Integer>test = new ArrayList<Integer>(); 
		test.add(2); 
		test.add(2); 
		ArrayList<Integer>PrimeHolder = PrimeNumbers.generatePrimeNumbers(4); 
		assertEquals(test, PrimeHolder); 
	}
	@Test
	public void testSix()
	{
		ArrayList<Integer>test = new ArrayList<Integer>(); 
		test.add(2); 
		test.add(3); 
		ArrayList<Integer>PrimeHolder = PrimeNumbers.generatePrimeNumbers(6); 
		assertEquals(test, PrimeHolder); 
	}
	@Test
	public void testEight()
	{
		ArrayList<Integer>test = new ArrayList<Integer>(); 
		test.add(2); 
		test.add(2);
		test.add(2);
		ArrayList<Integer>PrimeHolder = PrimeNumbers.generatePrimeNumbers(8); 
		assertEquals(test, PrimeHolder); 
	}
	
	
	@Test
	public void testNine()
	{
		ArrayList<Integer>test = new ArrayList<Integer>(); 
		test.add(3); 
		test.add(3);
		ArrayList<Integer>PrimeHolder = PrimeNumbers.generatePrimeNumbers(9); 
		assertEquals(test, PrimeHolder); 
	}
	
	
	
	@Test
	public void testBigNumber()
	{
		ArrayList<Integer>test = new ArrayList<Integer>(); 
		test.add(5); 
		test.add(7);
		test.add(7);
		test.add(1327);
		ArrayList<Integer>PrimeHolder = PrimeNumbers.generatePrimeNumbers(325115); 
		assertEquals(test, PrimeHolder); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
