package allbase;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A  {
	int a=3;
	@Test
	public void a() {
		int x=3;
		int y=2;
		if(x>y) {
			System.out.println("if con");
		}
		Assert.assertEquals(y, x);
		System.out.println("i am soft");
		
		
	try {
	
	int b=2;
	if(a>b) {
	System.out.println("i am good");
	
	}
	}catch(AssertionError ex) {
		System.out.println(2);
		
		
	}
	finally {
		System.out.println(9);
		
	}
	
	
	
	

}}
