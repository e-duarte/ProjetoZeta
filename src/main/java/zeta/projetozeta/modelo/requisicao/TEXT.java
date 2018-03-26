/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.requisicao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import zeta.projetozeta.modelo.historicovoo.HistoricoVoo;
import zeta.projetozeta.modelo.voo.Voo;

/**
 *
 * @author Jp
 */
public class TEXT implements iRequisicao{
    FileReader read;
    BufferedReader readBuffer;

    private void abreArquivos(){
        try {
            read = new FileReader("ArquivosVoos/voos.txt");
            readBuffer = new BufferedReader(read);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TEXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @Override
    public List<Voo> requisitar(String origem, String destino, String ida) {
         List<Voo> voos = new ArrayList<Voo>();
        abreArquivos();
        
        try {
        String[] linhaSeparada;
        String linha = readBuffer.readLine();
        while(linha != null){
            Voo voo = new Voo();
            linhaSeparada = linha.split(" ");
            voo.setCompanhia(linhaSeparada[0]);
            voo.setIdVoo(linhaSeparada[1]);
            voo.setOrigem(linhaSeparada[2]);
            voo.setDestino(linhaSeparada[3]);
            voo.setDuracao(linhaSeparada[6]);
            voo.setIda(ida);
            voo.getHistorico().add(new HistoricoVoo("30/01/18", Double.parseDouble(linhaSeparada[7])));
            voos.add(voo);
            
           linha = readBuffer.readLine();
        }
        readBuffer.close();
        read.close();
        } catch (Exception e) {
        }
        
        return voos;        
    }
    

}
