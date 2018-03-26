/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.controle;

import java.util.List;
import zeta.projetozeta.modelo.pesquisa.Pesquisa;

import zeta.projetozeta.modelo.pesquisa.PesquisaRN;
import zeta.projetozeta.modelo.voo.Voo;

/**
 *
 * @author Wagner N. Junior
 */
public class PesquisaControle {
    private PesquisaRN pesq;

    public PesquisaControle() {
        pesq = new PesquisaRN();
    }
    
    public List<Voo> chamaPesquisa(Pesquisa pesquisa){
        pesq.adicionarPesquisa(pesquisa);
        return pesq.buscarVoo(pesquisa);
    }
}
