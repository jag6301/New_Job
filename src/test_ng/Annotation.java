package test_ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@AfterSuite
	@Test
	public void testcase1()
	{
		System.out.println("AFTER SUITE EXECUTED");
	}
	@AfterTest
	@Test
	public void testcase2()
	{
		System.out.println("AFTER TEST EXECUTED");
	}
	@AfterClass
	@Test
	public void testcase3()
	{
		System.out.println("AFTER CLASS EXECUTED");
	}
	@AfterMethod
	@Test
	public void testcase4()
	{
		System.out.println("AFTER METHOD EXECUTED");
	}
	@BeforeSuite
	@Test
	public void testcase5()
	{
		System.out.println("BEFORE SUITE EXECUTED");
	}
	@BeforeTest
	@Test
	public void testcase6()
	{
		System.out.println("BEFORE TEST EXECUTED");
	}
	@BeforeClass
	@Test
	public void testcase7()
	{
		System.out.println("BEFORE CLASS EXECUTED");
	}
	@BeforeMethod
	@Test
	public void testcase8()
	{
		System.out.println("BEFORE METHOD EXECUTED");
	}

}
