package Maven_Projects.testScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class practice2 {
	@Test
	public void Practice10(){
		String url = System.getProperty("URL");
		System.out.println("This is my browser"+url);
		Reporter.log("This is method of maven for practice2,Practice10",true);
	}
	@Test
	public void Practice20(){
		Reporter.log("This is method of maven for practice2,Practice20",true);
	}
	public void Practice40() {
		Reporter.log("This is method of maven for practice2,Practice40",true);
	}
	@Test
	public void Practice30(){
		Reporter.log("This is method of maven for practice2,Practice30",true);
	}

}
