package com.All_Selenium;

import org.testng.annotations.Test;

public class TestNGParallel {
	
	@Test
	public void test1()
	{
		System.out.println("Test 1 is pass |" + Thread.currentThread().getId());
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test 2 is pass  |" + Thread.currentThread().getId());
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test 3 is pass |" + Thread.currentThread().getId());
	}

}
