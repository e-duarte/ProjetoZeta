/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.requisicao;

import java.util.List;
import zeta.projetozeta.modelo.voo.Voo;

/**
 *
 * @author Jp
 */
public interface iRequisicao {
    public List<Voo> requisitar(String origem, String destino, String ida);
   
}
