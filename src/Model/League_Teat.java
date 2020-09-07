package Model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class League_Teat {
	
	
	private League L1;
	
	@Before 
	public void initialTest() {
		L1 = new League("Cup");
	}
	
	
	@Test 
	public void newLeagueTest() {
		League L1 = new League();
		L1.setName("Champion");
		
		assertEquals("Champion", L1.getName());
		
	}
	
}
