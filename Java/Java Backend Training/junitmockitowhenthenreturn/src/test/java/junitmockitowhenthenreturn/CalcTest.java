package junitmockitowhenthenreturn;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class CalcTest {
	
	static Calculator mockCalcObject;
	static int a,b;
	@BeforeClass
	public static void init() {

		// set EmployeeDAO mock object
		mockCalcObject = mock(Calculator.class);
		
		when(mockCalcObject.sub(a,b)).thenReturn(a+b);
	}
	
	
	 
	//@Test
	//public void addTest() {
		//a=2;
		//b=3;
		//System.out.println("a="+a);
		//System.out.println("b="+b);
		//assertSame(mockCalcObject.add(a, b),5);
		//assertEquals(mockCalcObject.add(a, b),5);
		
		
	//}
	@Test
	public void subTest() {
		a=2;
		b=3;
		System.out.println("a="+a);
		System.out.println("b="+b);
		assertEquals(mockCalcObject.sub(a, b),5);
	
	
	}
}
	
	 
 
