package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	
	
  @Test(dataProvider="names")
  
  public void f(String s) {
	  System.out.println("TestNG Successful in f");
	  System.out.println(s);
  }
  
  @Test
  public void g() {
	  System.out.println("TestNG Successful in g");
  }
  
  @DataProvider(name="names")
  public String [] givingNames()
  {
	  String s[]=new String [3];
	  s[0]="Saurabh";
	  s[1]="Vijay";
	  s[2]="Koli";
	  return s;
  }
}
