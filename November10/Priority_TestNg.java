package com.November10;

import org.testng.annotations.Test;

public class Priority_TestNg {
@Test(priority=1)
public void createuser()
{
System.out.println("create user");	
}
@Test(priority=2)
public void modifyuser()
{
System.out.println("modify user");	
}
@Test(priority=3)
public void deleteuser()
{
System.out.println("delete user");	
}
}
