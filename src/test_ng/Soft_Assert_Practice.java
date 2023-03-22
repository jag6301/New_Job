package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Practice {
	
	@Test
	public void testcase1()
	{
		
		int a = 800;
	
		int b = 800;
		
		int c = 700;
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(a,b);
		
		System.out.println("AFTER THE ASSRTION");// PRINT
		
		sa.assertEquals(a,c);
		
		System.out.println("After the false assertion"); 
		// PRINT and PROGRAM NOT TERMINATED TILL CALLED SA.ASSERTALL METHOD
		
		//sa.assertAll();
	}

}
