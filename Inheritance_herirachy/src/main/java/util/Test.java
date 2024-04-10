package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {

    public static void main(String[] args) {
        try (SessionFactory sf = Hbutil.getSf();
             Session session = sf.openSession()) {
            Employee emp=new Employee(12,"heloo",90978d);
           // Temp_Employee temp = new Temp_Employee(24, "shamika", 9076d, "bsc", "engineer");
            
            Transaction transaction = session.beginTransaction();
            session.save(emp);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exception
        }
    }
}
