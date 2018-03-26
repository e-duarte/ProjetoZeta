/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import zeta.projetozeta.util.ConexaoHibernate;

/**
 *
 * @author Jp
 */
public class GenericDAO<T> implements iGenericDAO<T>{
    EntityManager manager;

    public GenericDAO() {
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void adicionar(T objeto) {
        manager.getTransaction().begin();
        manager.persist(objeto);
        manager.getTransaction().commit();
    }

    @Override
    public void remover(T objeto) {
        manager.getTransaction().begin();
        manager.remove(objeto);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(T objeto) {
        manager.getTransaction().begin();
        manager.merge(objeto);
        manager.getTransaction().commit();
    }

    @Override
    public T listOne(String columnName, String columnValue, Class clazz) {
        String jpql = " SELECT t FROM " + clazz.getTypeName() + " t where " + "t."+columnName + " = " + "\'"+columnValue+"\'";
        Query query = manager.createQuery (jpql);
        Object obj = query.getSingleResult();
        return (T) obj;
    }

    @Override
    public List<T> ListarTodos(Class objeto) {
        String consulta = " SELECT t FROM " + objeto.getTypeName() + " t";
        Query query = manager.createQuery(consulta);
        List<T> objects = query.getResultList();
        return objects;
    }

}
