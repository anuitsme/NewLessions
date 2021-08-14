package DumpData;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class TestProvider {
	
	@DataProvider(name="SignUpData")
	public Iterator<Object[]> getSignUpData() {
		
		ArrayList<Object[]> data=util.ExcelProvider.getSignUpData("SignUp");
		
		return data.iterator();
	}
	
	@BeforeMethod
	public void Setup() {
		
	}

	@Test(dataProvider = "SignUpData")
	public void TestData(String fname,String lname,String phone,String email, String customer, String password) {
		System.out.println("fname:lname:phone:email:customer:password");
		System.out.println(fname+":"+lname+":"+phone+":"+email+":"+customer+":"+password);
	}
	
}

