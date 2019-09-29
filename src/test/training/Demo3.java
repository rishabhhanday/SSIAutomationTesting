package training;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo3 {

	@Test
	public void c() {
		System.out.println("A");
	}

	@Test
	public void B() {
		System.out.println("B");
	}

	@Test
	public void A() {
		SoftAssert so = new SoftAssert();
		System.out.println("A1");
		so.assertEquals(true, false); //to see if actual value is equals to expected value.... for example when click on submit button check if new page contains Home as string by getting  findElement
		System.out.println("after assertion");
		System.out.println("A2");
		so.assertEquals(true, true); //to see if actual value is equals to expected value.... for examle when click on submit button check if new page contains Home as string by getting  findElement
		System.out.println("after assertion");
		so.assertAll();
	}
}
