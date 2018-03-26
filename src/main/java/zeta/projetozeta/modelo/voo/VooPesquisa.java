/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.voo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import zeta.projetozeta.modelo.pesquisa.Pesquisa;

/**
 *
 * @author Jp
 */
@Entity
@Table(name = "VooPesquisa")
public class VooPesquisa {
    @Id @Column(name = "id")
    @GeneratedValue
    private long id;
    
    @OneToOne
    @JoinColumn(name = "voo_id")
    private Voo voo;
    
    @OneToOne
    @JoinColumn(name = "pesquisa_id")
    private Pesquisa pesquisa;

    public VooPesquisa(Voo voo, Pesquisa pesquisa) {
        this.voo = voo;
        this.pesquisa = pesquisa;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Pesquisa getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(Pesquisa pesquisa) {
        this.pesquisa = pesquisa;
    }
}
