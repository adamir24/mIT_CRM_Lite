package Config;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBmanager {
    private static DBmanager instance;
    private EntityManagerFactory entityManagerFactory;
    private DBmanager(){

    };
    public synchronized static DBmanager getManager(){
        if (instance == null)
            instance = new DBmanager();
        return instance;
    }
    public EntityManagerFactory createEntityManagerFactory(){
        if (entityManagerFactory == null)
            entityManagerFactory = Persistence.createEntityManagerFactory("mIT_CRM");
        return entityManagerFactory;
    }
    public EntityManager createEntityManager() {
        return this.createEntityManagerFactory().createEntityManager();
    }
    public void closeEntityManagerFactory(){
        if(entityManagerFactory != null)
            entityManagerFactory.close();
    }
}
