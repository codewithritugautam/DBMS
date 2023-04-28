package hibernate.onetomany;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class HibernateUtil { //class name
private static StandardServiceRegistry registry; //reference create
private static SessionFactory sessionFactory; 
public static SessionFactory getSessionFactory() { 
try {
registry = new StandardServiceRegistryBuilder().configure().build();
MetadataSources sources = new MetadataSources(registry); 
Metadata data = sources.getMetadataBuilder().build();
sessionFactory = data.getSessionFactoryBuilder().build();
}catch(Exception ex) {
ex.printStackTrace();
}
return sessionFactory; 
}
}
