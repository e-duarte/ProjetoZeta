/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.menssagem;

/**
 *
 * @author Jp
 */
public class Menssagem {
    private String Menssagem;

    public Menssagem() {
        this.Menssagem = "Houve queda de preço para a passagem monitorada. Corra e faça a sua compra no site da companhia.";
    }

    public String getMenssagem() {
        return Menssagem;
    }

    public void setMenssagem(String Menssagem) {
        this.Menssagem = Menssagem;
    }
}
