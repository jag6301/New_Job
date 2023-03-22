package test_ng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
	
	@Test
	public void testcase1()
	{
		
		String a = "abc";
		
		String b = "Abc";
		
		Assert.assertEquals(a,b);
		
		System.out.println("AFTER THE ASSRTION");
		
		
	}

}
