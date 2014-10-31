package org.arpit.javapostsforlearning;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.Configuration;  
import org.hibernate.service.ServiceRegistry;  
import org.hibernate.service.ServiceRegistryBuilder;  
  
  
public class HibernateMain {  
  
public static void main(String[] args) {  
  
Configuration configuration=new Configuration();  
configuration.configure();  
ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();  
SessionFactory sf=configuration.buildSessionFactory(sr);  
Session ss=sf.openSession();  
  
Country countryIndia=new Country("India",50000000);  
Capital capitalDelhi=new Capital("Delhi",4000000);  
countryIndia.setCapital(capitalDelhi);  
Country countryFrance=new Country("France",20000000);  
Capital capitalParis=new Capital("Paris",1000000);  
countryFrance.setCapital(capitalParis);  
ss.beginTransaction();  
ss.save(countryIndia);  
ss.save(capitalDelhi);  
ss.save(countryFrance);  
ss.save(capitalParis);  
ss.getTransaction().commit();  
ss.close();  
  
}  
  
}  

