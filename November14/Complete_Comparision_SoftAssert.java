package com.November14;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Complete_Comparision_SoftAssert {
	@Test
	public void chechAssert()
	{
	String actual="hello";
	String expected="Hello";
	SoftAssert as=new SoftAssert();
	as.assertEquals(actual,expected);
	System.out.println("assertion completed");
	as.assertAll();
}
}