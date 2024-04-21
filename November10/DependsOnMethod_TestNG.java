package com.November10;

import org.testng.annotations.Test;

public class DependsOnMethod_TestNG {
@Test(dependsOnMethods="signup")
public void signin()
{
System.out.println("sign in that application");
}
@Test
public void signup()
{
System.out.println("first perform signup");	
}
}
