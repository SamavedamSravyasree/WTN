package com.wipro.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArraysort {

	@Test
	public void test() {
		DailyTasks d1=new DailyTasks();
		int []in= {4,2,3,1};
		int[]out= {1,2,3,4};
		assertArrayEquals(out,d1.Arraysort(in));
	}

}
