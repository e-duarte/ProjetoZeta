/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.testes;
import java.io.FileNotFoundException;
import zeta.projetozeta.modelo.menssagem.Email;
import zeta.projetozeta.modelo.monitor.MonitorRN;
import zeta.projetozeta.modelo.pesquisa.Pesquisa;
import zeta.projetozeta.modelo.requisicao.TEXT;
import zeta.projetozeta.modelo.requisicao.iRequisicao;
import zeta.projetozeta.modelo.usuario.Usuario;
import zeta.projetozeta.modelo.usuario.UsuarioRN;
import zeta.projetozeta.modelo.usuario.UsuarioSistema;


/**
 *
 * @author Jp
 */
public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
       iRequisicao r = new TEXT();
        
       UsuarioRN u = new UsuarioRN();
        
       //u.loginTeste(new Usuario("eduarte", "12345", "ewertonduarte37@gmail.com"));
       UsuarioSistema.setInstance(new Usuario("eduarte", "12345", "ewertonduarte37@gmail.com"));
       if(UsuarioSistema.getInstance() == null) System.out.println("Erro na classe principal");
       MonitorRN m = new MonitorRN();
       m.setUsuarioRN(u);
       Pesquisa p = new Pesquisa("TXT");
       
       p.setOrigem("BEL");
       p.setDestino("GRU");
       p.setIda("11/12/17");
        
       m.adicionarVoo("JJ3387", p);
       m.monitorar();
       //Email email = new Email();
       //email.enviaMenssagem("João", "ewertonduarte37@gmail.com");
       //UsuarioControle u = new UsuarioControle();
       //u.cadastrarUsuario(new Usuario("joao", "1234", "sadasdsadas"));
    }
}
