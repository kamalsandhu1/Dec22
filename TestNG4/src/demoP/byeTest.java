package demoP;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class byeTest {
	
	@Test
	public void Demo2() {
		System.out.println("good");
		
	}
	
	@AfterSuite
	public void Demo3() {
		System.out.println("After");
		
	}

	@BeforeTest
	public void Demo4() {
		System.out.println("Before");
		
	}


}
