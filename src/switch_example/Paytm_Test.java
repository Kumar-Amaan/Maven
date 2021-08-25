package switch_example;

import org.testng.annotations.Test;

public class Paytm_Test {

 

 @Test(priority=1, description="Enter correct Username")
public void LogoutTest() {

 System.out.println("Correct username");

 }

 @Test(priority=2,description="Enter correct password")
public void AddItems() {

 System.out.println("Correct Password");

 }
 
 @Test(priority=0,description="Click on Login button")
 public void LoginTest() {

  System.out.println("Clicked on login button");

  }

 @Test(priority=3,description="Add products")
public void Product_Add() {

 System.out.println("Products Added");

 }
 @Test(priority=4,description="Payment")
 public void Payment() {

  System.out.println("Add Payment");

  }
 @Test(priority=5,description="Click to log out")
 public void Logout() {

  System.out.println("Log Out");

  }

}