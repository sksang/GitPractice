package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest01 {
  @Test(dataProvider="names")
  public void f(String s) {
	  System.out.println(s);
  }
  
  @Test
  public void g() {
	  System.out.println("This is test G");
  }
  @DataProvider(name="names")
  public String [] givingNames()
  {
	  String[] stringArray=new String[5];
	  stringArray[0]="India";
	  stringArray[1]="Russia";
	  stringArray[2]="USA";
	  stringArray[3]="UK";
	  stringArray[4]="France";
	  
	  return stringArray;
  }
}
