
import dto.product;
import org.hibernate.SessionFactory;
import java.util.Properties;
import org.hibernate.cfg.Configuration;

public class connection {
    public static SessionFactory getConnection() {
        Properties prop = new Properties();
        prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        prop.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/User");
        prop.setProperty("hibernate.connection.username", "root");
        prop.setProperty("hibernate.connection.password", "root");
        prop.setProperty("hibernate.hbm2ddl.auto", "update");
        prop.setProperty("hibernate.show_sql", "true");
        
        Configuration cfg=new Configuration();
        cfg.addProperties(prop);
        cfg.addAnnotatedClass(product.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        return sf;  
    }
}
