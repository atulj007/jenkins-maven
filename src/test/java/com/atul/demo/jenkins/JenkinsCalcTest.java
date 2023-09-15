package com.atul.demo.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;


public class JenkinsCalcTest {

	@Test
	public void addTest()
	{
    JenkinsCalculator myCalc = new JenkinsCalculator();
    assertEquals(10,myCalc.addnum(5, 5));
	}
	

	@Test
	public void subTest()
	{
    JenkinsCalculator myCalc = new JenkinsCalculator();
    assertEquals(5,myCalc.subnum(10, 5));
	}
	
}
