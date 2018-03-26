/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.pesquisa;

import java.io.FileNotFoundException;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import zeta.projetozeta.modelo.requisicao.TEXT;
import zeta.projetozeta.modelo.requisicao.XML;
import zeta.projetozeta.modelo.requisicao.iRequisicao;
import zeta.projetozeta.modelo.voo.AbstractVoo;

/**
 *
 * @author Jp
 */
@Entity
@Table(name = "Pequisa")
public class Pesquisa extends AbstractVoo{
    //@Temporal(TemporalType.DATE)
    //private String volta;
    
    //private boolean idaVolta;
    
    @Transient
    private iRequisicao requisicao;

    public Pesquisa(String tipoRequisicao) throws FileNotFoundException {
        if(tipoRequisicao.equals("XML"))
            requisicao = new XML();
        else
            requisicao = new TEXT();
    }
    
    

    public iRequisicao getRequisicao() {
        return requisicao;
    }

    public void setRequisicao(iRequisicao requisicao) {
        this.requisicao = requisicao;
    }
}
