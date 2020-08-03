package Util;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {
    public static final SessionFactory sessionFactory;

    static {
        try {
            // Creation de la SessionFactory a partir de hibernate.cfg.xml
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

   // public static final ThreadLocal session = new ThreadLocal();

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}