package tenders;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.junit.Test;

public class HibernateUtilsTest {

	
	
	
	@Test
	public void test() throws Exception {
		
		
		SessionFactory factory = HibernateUtils
				.configureNewFactory();
		
	}
	
}
