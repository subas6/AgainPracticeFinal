package com.November14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Partial_Comparision_HardAssert {
@Test
public void chechAssert()
{
String actual="hello";
String expected="hell";
Assert.assertTrue(actual.contains(expected));
System.out.println("assertion completed");
}
}