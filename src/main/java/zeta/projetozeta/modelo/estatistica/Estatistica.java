/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.estatistica;

import java.awt.Dimension;
import java.util.Calendar;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import zeta.projetozeta.modelo.historicovoo.HistoricoVoo;
import zeta.projetozeta.modelo.voo.Voo;

/**
 *
 * @author Jp
 */
public class Estatistica {
    private Voo vooEstatistica;
    private DefaultCategoryDataset dados;
    private JFreeChart grafico;
    
   /* public Estatistica(Voo Estatistica) {
        this.vooEstatistica = vooEstatistica;
        this.dados= new DefaultCategoryDataset();
    }    
    
    public ChartPanel realizarEstatistica(){
       String mesAno;
       for(HistoricoVoo aux : vooEstatistica.getHistorico()){
           mesAno = String.format("%d/%d",aux.getDataHora().get(Calendar.MONTH), aux.getDataHora().get(Calendar.YEAR));
           dados.addValue(aux.getPreco(), "MenorPreco",mesAno);
       }
       grafico = ChartFactory.createBarChart("Variação a cada Pesquisa", "X", "Y", dados, 
                                            PlotOrientation.VERTICAL, false, false, false);
       ChartPanel panel = new ChartPanel(grafico);
       panel.setPreferredSize(new Dimension(400, 400));
       
       return panel;
    }
    
    public Voo getVooEstatistica() {
        return vooEstatistica;
    }

    public void setVooEstatistica(Voo vooEstatistica) {
        this.vooEstatistica = vooEstatistica;
    }*/

}
