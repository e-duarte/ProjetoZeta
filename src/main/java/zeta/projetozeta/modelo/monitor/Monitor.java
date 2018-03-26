/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.monitor;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import zeta.projetozeta.modelo.menssagem.AlertaSistema;
import zeta.projetozeta.modelo.menssagem.Email;
import zeta.projetozeta.modelo.menssagem.iEnviaMenssagem;
import zeta.projetozeta.modelo.usuario.Usuario;
import zeta.projetozeta.modelo.voo.VooPesquisa;

/**
 *
 * @author Jp
 */
@Entity
@Table(name = "Monitor")
public class Monitor {
    @Id 
    @GeneratedValue
    @Column(name = "id")
    private long id;
    
    @OneToMany
    @JoinTable(name = "monitor_voo", 
            joinColumns = @JoinColumn(name = "monitor_id"),
            inverseJoinColumns = @JoinColumn(name = "voo_id"))
    private List<VooPesquisa> vooMonitorados;
    
    @Transient
    private List<iEnviaMenssagem> acoes;
    
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Monitor() {
        acoes = new ArrayList<iEnviaMenssagem>();
        acoes.add(new AlertaSistema());
        acoes.add(new Email());
        
        vooMonitorados = new ArrayList<VooPesquisa>();
    }

    
    
    public List<VooPesquisa> getVooMonitorados() {
        return vooMonitorados;
    }

    public void setVooMonitorados(List<VooPesquisa> vooMonitorados) {
        this.vooMonitorados = vooMonitorados;
    }

    public List<iEnviaMenssagem> getAcoes() {
        return acoes;
    }

    public void setAcoes(List<iEnviaMenssagem> acoes) {
        this.acoes = acoes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
