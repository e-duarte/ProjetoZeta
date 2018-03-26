/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.historicovoo;

import zeta.projetozeta.modelo.voo.Voo;

/**
 *
 * @author Jp
 */
public class HistoricoVooRN {
    public void removerHistorico(Voo voo){
        voo.setHistorico(null);
    }
}
