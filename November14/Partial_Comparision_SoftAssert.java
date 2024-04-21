package com.November14;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Partial_Comparision_SoftAssert {
	@Test
	public void chechAssert()
	{
	String actual="hello";
	String expected="hell";
	SoftAssert as=new SoftAssert();
	as.assertTrue(actual.contains(expected));
	System.out.println("assertion completed");
	as.assertAll();
}
}