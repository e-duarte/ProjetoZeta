/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;

/**
 *
 * @author Jp
 */
public class ConexaoHibernate {
    private static EntityManagerFactory factory;
    private volatile static EntityManager manager;

    public ConexaoHibernate() {}
    
     public static EntityManager getInstance() {
        if (manager == null) {
            synchronized (ConexaoHibernate.class) {
                if (manager == null) {
                    try {
                        factory = Persistence.createEntityManagerFactory("ProjetoZeta");
                        manager = factory.createEntityManager();
                    } catch (HibernateException he) {
                        System.err.println(he.getMessage());
                    }
                }
            }
        }
        
        return manager;
    }
}
