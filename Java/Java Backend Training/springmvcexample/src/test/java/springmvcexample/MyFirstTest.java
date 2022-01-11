package springmvcexample;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyFirstTest {
@Before	
public void setup() throws Exception {
	System.out.println("setup");
}
@After
public void teardown() throws Exception {
	System.out.println("teardown");
}
	@Test
	public void test() {
	fail("not yet implemented");
	}
	}