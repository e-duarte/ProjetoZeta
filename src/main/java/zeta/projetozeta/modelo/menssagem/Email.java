/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.menssagem;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;




/**
 *
 * @author Jp
 */
public class Email extends Menssagem implements iEnviaMenssagem {
    private SimpleEmail email;

    public Email() {
        email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com"); // o servidor SMTP para envio do e-mail
        email.setSmtpPort(465);
        email.setAuthentication("victorduart366@gmail.com", "egdn2015");
        email.setSSLOnConnect(true);
    }
    
    
    
    @Override
    public void enviaMenssagem(String nome, String emmail) {
        try {
            email.setFrom("victorduart366@gmail.com");
            email.setSubject("Notificaçao de Passagem "); // assunto do e-mail
            setMenssagem("Senhor "+nome+"\n"+getMenssagem());
            email.setMsg(getMenssagem()); //conteudo do e-mail
            email.addTo(emmail); //destinatário
            email.send(); //envia o e-mail
        } catch (EmailException ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
