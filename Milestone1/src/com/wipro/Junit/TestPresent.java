package com.wipro.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPresent {

	@Test
	public void test() {
		DailyTasks d1=new DailyTasks();
		assertEquals(true,d1.Present("Sravya", "av"));
	}

}
