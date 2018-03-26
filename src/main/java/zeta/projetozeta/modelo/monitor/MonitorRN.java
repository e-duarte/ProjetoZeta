/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.monitor;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import zeta.projetozeta.modelo.DAO.GenericDAO;
import zeta.projetozeta.modelo.historicovoo.HistoricoVoo;
import zeta.projetozeta.modelo.menssagem.iEnviaMenssagem;
import zeta.projetozeta.modelo.pesquisa.Pesquisa;
import zeta.projetozeta.modelo.usuario.Usuario;
import zeta.projetozeta.modelo.usuario.UsuarioRN;
import zeta.projetozeta.modelo.usuario.UsuarioSistema;
import zeta.projetozeta.modelo.voo.Voo;
import zeta.projetozeta.modelo.voo.VooPesquisa;
import zeta.projetozeta.modelo.voo.VooRN;

/**
 *
 * @author Jp
 */
public class MonitorRN {
    private GenericDAO<Monitor> genericDAO;
    private Monitor monitor;
    private VooRN vooRN;
    private UsuarioRN usuarioRN;
    public static final long TEMPO = (1000 * 1);
    
    public MonitorRN() {
        genericDAO = new GenericDAO<Monitor>();
        monitor = new Monitor();
        monitor.setUsuario(UsuarioSistema.getInstance());
        vooRN = new VooRN();
        usuarioRN = new UsuarioRN();        
    }
    
    public void monitorar(){
        Timer timer = null;
            if (timer == null) {
		timer = new Timer();
                TimerTask tarefa = new TimerTask() {
                    public void run() {
                        try {
                            if(!monitor.getVooMonitorados().isEmpty()){
                                for(VooPesquisa voosMonitorados : monitor.getVooMonitorados()){
                                    List<Voo> voos = usuarioRN.PesquisarVoo(voosMonitorados.getPesquisa());
                                    if(voos != null){
                                        for(Voo v : voos){
                                            if(v.getIdVoo().equals(voosMonitorados.getVoo().getIdVoo())){
                                                HistoricoVoo historicoMonitorado = /* talves dê nullpointer caso a lista de historico seja nula*/
                                                        voosMonitorados.getVoo().getHistorico().get(voosMonitorados.getVoo().getHistorico().size()-1);
                                                HistoricoVoo historicoPesquisado = v.getHistorico().get(v.getHistorico().size()- 1);
                                                if(historicoMonitorado.getPreco() > historicoPesquisado.getPreco()){
                                                    realizarAcoes();
                                                    vooRN.insereHistorico(historicoPesquisado.getDataHora(), historicoPesquisado.getPreco(), v);
                                                    System.out.println("SIM1");
                                                }else
                                                    System.out.println("NÃO1");     
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
			}
                    }
		};
                timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);
            }
            
    }
    
    public void adicionarVoo(String idVoo, Pesquisa pesquisa){
        for(Voo v : pesquisa.getRequisicao().requisitar(pesquisa.getOrigem(), pesquisa.getDestino(), pesquisa.getIda())){
            if(idVoo.equals(v.getIdVoo())){
                monitor.getVooMonitorados().add(new VooPesquisa(v, pesquisa));
                break;
            }
        }
    }
    
    public void removerVoo(String idVoo){
        for(int i = 0; i < monitor.getVooMonitorados().size(); i++){
            if(monitor.getVooMonitorados().get(i).getVoo().getIdVoo().equals(idVoo)){
                monitor.getVooMonitorados().remove(i);
                break;
            }
        }   
    }
    
    private void realizarAcoes(){
        /*for(iEnviaMenssagem acao : monitor.getAcoes())
            acao.enviaMenssagem(monitor.getUsuario().getNome(), monitor.getUsuario().getEmail());*/
        System.out.println("Enviado o email");
        //monitor.getAcoes().get(1).enviaMenssagem(monitor.getUsuario().getNome(), monitor.getUsuario().getEmail());
    }

    public GenericDAO<Monitor> getGenericDAO() {
        return genericDAO;
    }

    public void setGenericDAO(GenericDAO<Monitor> genericDAO) {
        this.genericDAO = genericDAO;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public VooRN getVooRN() {
        return vooRN;
    }

    public void setVooRN(VooRN vooRN) {
        this.vooRN = vooRN;
    }

    public UsuarioRN getUsuarioRN() {
        return usuarioRN;
    }

    public void setUsuarioRN(UsuarioRN usuarioRN) {
        this.usuarioRN = usuarioRN;
    }
}
