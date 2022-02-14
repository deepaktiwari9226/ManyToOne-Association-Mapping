package org.jspider.hibernateApp;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class Dao
{
	public static void main(String[] args) 
	{
     Person person = new Person();
     person.setPerson_name("Aju");
     
     Car c1 = new Car();
     c1.setCar_name("Audi");
     c1.setCar_model("VolksWagen");
     c1.setPerson(person);
     
     Car c2 = new Car();
     c2.setCar_name("320d");
     c2.setCar_model("BMW");
     c2.setPerson(person);
     
     Car c3 = new Car();
     c3.setCar_name("Aston Martin");
     c3.setCar_model("Ford");
     c3.setPerson(person);
    
     Configuration conf = new Configuration();
     conf.configure();
     SessionFactory sef = conf.buildSessionFactory();
     Session ses = sef.openSession();
     Transaction tran = ses.beginTransaction();
     ses.save(c1);
     ses.save(c2);
     ses.save(c3);
     tran.commit();
     ses.close();
	}
}
