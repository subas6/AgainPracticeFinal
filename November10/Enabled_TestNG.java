package com.November10;

import org.testng.annotations.Test;

public class Enabled_TestNG {
@Test
public void createUser()
{
System.out.println("Create User");	
}
@Test(enabled=false)
public void deleteuser()
{
System.out.println("delete user");	
}
}
