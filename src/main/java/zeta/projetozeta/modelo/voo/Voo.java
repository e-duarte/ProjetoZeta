/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.voo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import zeta.projetozeta.modelo.historicovoo.HistoricoVoo;


/**
 *
 * @author Jp
 */
@Entity
@Table(name = "Voo")
public class Voo extends AbstractVoo{
    private String idVoo;
    private String duracao;
    private String companhia;
    @OneToMany
    @JoinTable(name = "voo_historico", 
            joinColumns = @JoinColumn(name = "voo_id"),
            inverseJoinColumns = @JoinColumn(name = "historico_id"))
    private List<HistoricoVoo> historico;
    
    public Voo() {
        historico = new ArrayList<HistoricoVoo>();
    }

    public String getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(String idVoo) {
        this.idVoo = idVoo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public List<HistoricoVoo> getHistorico() {
        return historico;
    }

    public void setHistorico(List<HistoricoVoo> historico) {
        this.historico = historico;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }
    
}
