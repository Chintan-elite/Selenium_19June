package org;

import org.testng.annotations.Test;

public class Account {
	
		@Test
		public void saving()
		{
			System.out.println("Runing saving account");
		}
		
		@Test(groups = "smoke")
		public void current()
		{
			System.out.println("Runing cureent account");
		}
		
		@Test(groups = "sanity")
		public void loan()
		{
			System.out.println("Runing loan account");
		}
}

