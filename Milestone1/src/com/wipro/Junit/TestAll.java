package com.wipro.Junit;

import static org.junit.Assert.*;

import org.junit.Test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({TestPresent.class, TestConc.class, TestArraysort.class})
public class TestAll 
{
  
}
