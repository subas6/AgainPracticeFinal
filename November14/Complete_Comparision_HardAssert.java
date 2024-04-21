package com.November14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Complete_Comparision_HardAssert {
@Test
public void chechAssert()
{
String actual="Google";
String expected="google";
Assert.assertEquals(actual,expected);
System.out.println("assertion completed");
}
}
