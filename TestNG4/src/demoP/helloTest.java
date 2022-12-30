package demoP;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class helloTest {
	
	@Test
	public void Demo()
	{
		System.out.println("hello");
		
	}

	@Parameters({"URL"})
	@Test
	public void Demo1(String link)
	{
		System.out.println("hellobye");
		System.out.println(link);
		
	}
}
