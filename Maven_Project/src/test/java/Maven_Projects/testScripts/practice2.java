package Maven_Projects.testScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class practice2 {
	@Test
	public void Practice1000(){
		String url = System.getProperty("URL");
		String browser = System.getProperty("BROWSER");
		System.out.println("This is my browser"+url);
		Reporter.log("This is method of maven for practice2,Practice10",true);
	}
	@Test
	public void Practice20(){
		Reporter.log("This is method of maven for practice2,Practice20",true);
	}
	public void Practice434() {
		Reporter.log("This is method of maven for practice2,Practice40",true);
		
	}
	@Test
	public void Practice30(){
		Reporter.log("This is method of maven for practice2,Practice30",true);
	}
	@Test
	public void Practice304(){
		Reporter.log("This is method of maven for practice2,Practice30",true);
	}
	
	

}
