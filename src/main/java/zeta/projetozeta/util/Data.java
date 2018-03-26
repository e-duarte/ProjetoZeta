/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.util;

/**
 *
 * @author Jp
 */
public class Data {
    public static String[] getData(String data,String separador){
        String[] vetorData = data.split(separador);
        return vetorData;
    }
}
