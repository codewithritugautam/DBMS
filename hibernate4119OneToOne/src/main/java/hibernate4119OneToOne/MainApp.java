package hibernate4119OneToOne;
 import org.hibernate.Session;
 import org.hibernate.Transaction;
 public class MainApp{
public static void main(String[] args) {
Person deepak = new Person("Ritu Gautam","Delhi");
Adhaar ada = new Adhaar(71122345);
deepak.setAdhar(ada);
Transaction txn;
try(Session session=HibernateUtil.getSessionFactory().openSession()){
txn = session.beginTransaction();
session.save(deepak);
txn.commit();
}
}
}
