/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.pesquisa;

import java.util.List;
import zeta.projetozeta.modelo.DAO.GenericDAO;
import zeta.projetozeta.modelo.voo.Voo;

/**
 *
 * @author Jp
 */
public class PesquisaRN {
    GenericDAO<Pesquisa> genericDAO;
    
    public PesquisaRN(){
        genericDAO = new GenericDAO<Pesquisa>();
    }
    
    public List<Voo> buscarVoo(Pesquisa pesquisa){
        String origem = pesquisa.getOrigem();
        String destino = pesquisa.getDestino();
        String ida = pesquisa.getIda();
        //Calendar volta = pesquisa.getVolta();
        //boolean idaVolta = pesquisa.isIdaVolta();
        return pesquisa.getRequisicao().requisitar(origem, destino, ida);
    }
    
    public void adicionarPesquisa(Pesquisa pesquisa){
        genericDAO.adicionar(pesquisa);
    }
    
    public void removerPesquisa(Pesquisa pesquisa){
        genericDAO.remover(pesquisa);
    }
}
