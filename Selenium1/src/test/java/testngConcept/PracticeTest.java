package testngConcept;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTest {
	
	@Test
	public void createAccountTest() {
		
		System.out.println("create account");
		Assert.assertEquals("Pune", "hadapsar");
		
	}
	
	@Test(dependsOnMethods="createAccountTest")
	public void deleteAccountTest() {
		
		System.out.println("delete Account");
		
	}
	
	@Test
	public void modifyAccountTest() {
		
		System.out.println("modify account");
		
			
		}
	}


