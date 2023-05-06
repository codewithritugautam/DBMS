package hibernate.Threater.to.store;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class  Main_Theator_to_Store {
public static void main(String[] args) {
	Theartor_to_Store clang = new Theartor_to_Store(1001," 3 Idiots","Dhoom 3");
	Theartor_to_Store jlang = new Theartor_to_Store(1002,"Padmaavat","Pathaan");
	Theartor_to_Store cpplang = new Theartor_to_Store(1003,"Chennai Express","Dangle");
Transaction txn;
try(Session session = HibernateUtil.getSessionFactory().openSession()){
txn = session.beginTransaction();
session.save(clang);
session.save(jlang);
session.save(cpplang);
txn.commit();
}
}
}
