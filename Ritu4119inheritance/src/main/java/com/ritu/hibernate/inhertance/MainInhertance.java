package com.ritu.hibernate.inhertance;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class MainInhertance {
public static void main(String... args) {
Child arun = new Child();
arun.setId(1234);
arun.setName("Ritu Gautam");
arun.setAddress("delhi");
arun.setEmail("ritugautam12@gmail.com");
Transaction txn;
try(Session session=HibernateUtil.getSessionFactory().openSession()){
txn = session.beginTransaction();
session.save(arun);
txn.commit();
txn = session.beginTransaction();
Child fat = session.get(Child.class, 1L);
System.out.println("ID : "+fat.getId());
System.out.println("Name : "+fat.getName());
System.out.println("Email : "+fat.getEmail());
System.out.println("Address : "+fat.getAddress());
txn.commit();
txn = session.beginTransaction();
fat.setName("Xavier");
fat.setEmail("xavier.joseph@gmail.com");
session.update(fat);
txn.commit();
session.close();
}
}
}
