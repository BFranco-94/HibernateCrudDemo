package com.control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.to.Player;

public class HibernateMain {

	public static void main(String[] args) {
		try {
			Configuration cfg = new Configuration().configure();
			cfg.addAnnotatedClass(com.to.Player.class); 
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties());
			
			SessionFactory factory = cfg.buildSessionFactory(builder.build());
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			//will create a new row on DB and store it on it
			Player player1 = new Player(28, "Bryan", "Warriors");
			
			/* 
			 * 		will create a entire record 
			 * 
			 * session.save(player1);
			 * 
			 * 		retrieve a record from database
			 * 
			 * Player p = session.get(Player.class, 1);
			 * System.out.println("details: "+p);
			 * 
			 * 		modify/update some value only
			 * 
			 * player1.setPlayerName("Carlos");
			 * player1.setAge(40);
			 * 
			 * NOTE: if we want to modify/update some values, we need to change the "hbm2ddl.auto" hibernate property value to "update"
			 * 
			 * 		delete a value
			 * 
			 * session.delete(player1);
			 * 
			 * */
			
			session.save(player1);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("error on > "+e.getMessage());
		}
		
		
	}

}
