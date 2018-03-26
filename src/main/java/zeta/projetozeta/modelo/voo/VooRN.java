/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.voo;

import java.util.Calendar;
import zeta.projetozeta.modelo.DAO.GenericDAO;
import zeta.projetozeta.modelo.historicovoo.HistoricoVoo;
import zeta.projetozeta.modelo.historicovoo.HistoricoVooRN;

/**
 *
 * @author Jp
 */
public class VooRN {
    private GenericDAO<Voo> genericDAO;
    private HistoricoVooRN historico;
    
    public VooRN() {
        genericDAO = new GenericDAO<>();
    }
    
    public void insereHistorico(String dataHora, double preco, Voo voo){
        voo.getHistorico().add(new HistoricoVoo(dataHora, preco));
    }
    
    public void adicionarVoo(Voo voo){
        genericDAO.adicionar(voo);
    }
    
    public void removerVoo(Voo voo){
        genericDAO.remover(voo);
    }
}
