package com.November10;

import org.testng.annotations.Test;

public class InvocationCount_TestNG {
@Test(invocationCount=5)
public void ceateuser()
{
System.out.println("CreateUser");	
}
}
