/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.historicovoo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jp
 */
@Entity
@Table(name = "HistoricoVoo")
public class HistoricoVoo {
    @Id @GeneratedValue @Column(name = "id")
    private long id;
    private String dataHora;
    private double preco;

    public HistoricoVoo(String dataHora, double preco) {
        this.dataHora = dataHora;
        this.preco = preco;
    }

    
    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
