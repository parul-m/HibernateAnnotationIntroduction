
import dto.product;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainProduct {
    public static void main(String[] args) {
        Session s = connection.getConnection().openSession();
        Transaction t = s.beginTransaction();
        product obj = new product(101, "mobile", 34000);
        s.save(obj);
        t.commit();
        s.close(); 
    }
}
