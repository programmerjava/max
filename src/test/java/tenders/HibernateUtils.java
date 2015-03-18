package tenders;

import java.util.function.Consumer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtils {
	
	
	
	
	
	
	
	public static SessionFactory configureNewFactory() {
		Configuration configuration = new Configuration().configure();
		
		ServiceRegistry registry = new ServiceRegistryBuilder()
			.applySettings(configuration.getProperties()).build();
		
		
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(registry);
		return sessionFactory;
	}
	
	
	
	
	public static Session openSession() {
		return configureNewFactory().openSession();
	}
	
	
	public static Session beginTransaction() {
		Session session = configureNewFactory().openSession();
		session.beginTransaction();
		return session;
	}
	
	
	
	
	
}
