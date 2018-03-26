/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.DAO;

import java.util.List;

/**
 *
 * @author Jp
 */
public interface iGenericDAO<T>{
    public void adicionar(T objeto);
    public void remover(T objeto);
    public void atualizar(T objeto);
    public T listOne(String columnName, String columnValue, Class clazz);
    public List<T> ListarTodos(Class objeto);
}
