package com.wipro.Junit;

import java.util.Arrays;

public class DailyTasks {
  public String Conc(String a,String b) {
	  return (a+" "+b);
  }
  public int[] Arraysort(int a[]) {
	  Arrays.sort(a);
	  return a;
  }
  public Boolean Present(String str,String a) {
	  return str.contains(a);
  }
}
