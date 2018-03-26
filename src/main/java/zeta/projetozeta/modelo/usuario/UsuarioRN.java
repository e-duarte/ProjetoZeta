/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.usuario;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import zeta.projetozeta.modelo.DAO.GenericDAO;
import zeta.projetozeta.modelo.pesquisa.Pesquisa;
import zeta.projetozeta.modelo.pesquisa.PesquisaRN;
import zeta.projetozeta.modelo.voo.Voo;

/**
 *
 * @author Jp
 */
public class UsuarioRN {
    private GenericDAO<Usuario> genericDAO;
    
    public UsuarioRN() {
        genericDAO = new GenericDAO<Usuario>();
    }
    
    public boolean login(Usuario usuario){
        Usuario usuarioBD = buscarUsuario("nome",usuario.getNome(), usuario.getClass());
        if(usuario != null && usuarioBD.getNome().equals(usuario.getNome())){
            UsuarioSistema.setInstance(usuario);
            return true;
        }else
            return false;
    }

    public List<Voo> PesquisarVoo(Pesquisa pesquisa) throws FileNotFoundException{
        PesquisaRN pesquisaRN = new PesquisaRN();
        if(UsuarioSistema.getInstance() == null){
            return null;
        }
        
        //UsuarioSistema.setInstancePesquisa(pesquisa);
        return pesquisaRN.buscarVoo(pesquisa);
    }
    
    public void adicionarUsuario(Usuario usuario){
        genericDAO.adicionar(usuario);
        //new GenericDAO<Pesquisa>().adicionar(usuario.getPesquisa().get(usuario.getPesquisa().size()-1));
    }
    
    public void removerUsuario(Usuario usuario){
        genericDAO.remover(usuario);
        /*for(Pesquisa pesquisa : usuario.getPesquisa())
            genericDAO.remover(pesquisa);*/
    }
    
    public void atualizarUsuario(Usuario usuario){
        genericDAO.atualizar(usuario);
    }
    
    private Usuario buscarUsuario(String coluna, String colunaValor, Class clazz){
        return genericDAO.listOne(coluna, colunaValor, clazz);
    }
    
    public List<Usuario> listaUsuarios(Class clazz){
        return genericDAO.ListarTodos(clazz);
    }
}
