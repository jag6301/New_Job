package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Practice {
	
	@Test
	public void testcase1()
	{
		
		int a = 800;
	
		int b = 800;
		
		int c = 700;
		
		Assert.assertEquals(a,b);
		
		System.out.println("AFTER THE ASSRTION");// PRINT
		
		Assert.assertEquals(a,c);
		
		System.out.println("After the false assertion"); // NOT PRINT PROGRAM TERMINATED
		
		
	}

}
