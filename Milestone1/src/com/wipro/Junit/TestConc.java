package com.wipro.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConc {

	@Test
	public void test() {
		DailyTasks d=new DailyTasks();
		assertEquals("Sravya Sree",d.Conc("Sravya", "Sree"));
	}

}
