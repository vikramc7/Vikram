package com.mits.testng;

import org.testng.annotations.Test;

public class TestNG4 {
	  @Test(priority = 2) // Second Highest Priority
	   public void a_test() {
		  System.out.println("2");
	   }

	  @Test(priority = 3) // Lowest Priority
	  public void c_test() {
		  System.out.println(3);
	  }

	  @Test(priority = 1) // Highest Priority
	  public void b_test() {
		  System.out.println(1);
	  }
	
}
