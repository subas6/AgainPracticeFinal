package com.November10;

import org.testng.annotations.Test;

public class Priority_TestNg1 {
@Test(priority=-5)
public void createuser()
{
System.out.println("create user");	
}
@Test(priority=0)
public void modifyuser()
{
System.out.println("modify user");	
}
@Test(priority=8)
public void deleteuser()
{
System.out.println("delete user");	
}
}
