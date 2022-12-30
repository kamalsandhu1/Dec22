package demoP;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void carLoan() {
		System.out.println("apple");
		
	}
//here is the change
	//another change
	@Test(groups= {"smoke"})
	public void bikeLoan() {
		System.out.println("apple2");
		
	}
	
	@Test(dataProvider = "getData")
	public void tvLoan(String username, String password) {
		System.out.println("apple3");
		System.out.println(username+password);
		
	}
	
	@Test(groups= {"smoke"})
	public void houseLoan() {
		System.out.println("apple4");
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "firstusernme";
		data[0][1] = "firstpass";
		data[1][0] = "2usernme";
		data[1][1] = "2pass";
		data[2][0] = "3usernme";
		data[2][1] = "3pass";
		return data;
	}
	
}
