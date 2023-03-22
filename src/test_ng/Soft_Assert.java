package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	public void testcase1()
	{
		
		String a = "abc";
		
		String b = "Abc";
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(a,b);
		
		System.out.println("AFTER THE ASSERTION");
		
		sa.assertAll();
		
		
	}

}
