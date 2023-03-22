package test_ng;

import org.testng.annotations.Test;

public class Timeout_Keyword {
	
	@Test
	public void testcase1()
	{
		System.out.println("TEST CASE 1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("TEST CASE 2");
	}
	@Test(timeOut = 1)//TEST CASE GET TIME FOR EXECUTION IS MORE THAN TIMEOUT THEN TEST CASE MARKED AS FAILED
	public void testcase3()
	{
		System.out.println("TEST CASE 3");
	}
	@Test
	public void testcase4()
	{
		System.out.println("TEST CASE 4");
	}

}
