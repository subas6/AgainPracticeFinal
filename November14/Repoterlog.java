package com.November14;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Repoterlog {
@Test
public void customerCreation()
{
System.out.println("Customer Creates");
Reporter.log("created customer successfully");
}
@Test
public void modifyCustomer()
{
System.out.println("Customer modified");
Reporter.log("Customer modified successfully",true);
}
}
