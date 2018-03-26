/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.menssagem;

import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author Jp
 */
public class AlertaSistema implements iEnviaMenssagem {

    @Override
    public void enviaMenssagem(String nome, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/*public static JMenuItem quit;
    @Override
    public void enviaMenssagem(String nome, String email) {
    JPopupMenu menu = new JPopupMenu("Tray Icon Menu");
        menu.add(new JMenuItem("Test Item"));
        menu.addSeparator();
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }});
        menu.add(quitItem);
        
        // O arquivo “devmedia.gif” deve existir no mesmo diretório

        // onde estiver esta classe.
        ImageIcon icon = new ImageIcon("duke.gif");
        TrayIcon ti = new TrayIcon(icon, "JDIC Tray Icon API Test", menu);

        // Ação para clique com botão esquerdo.
        ti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, 
                    "JDIC Tray Icon API Test!", "About",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });
               
        SystemTray tray = SystemTray.getDefaultSystemTray();
        tray.addTrayIcon(ti);
    }

    public static void main(String[] args) {
        new TestTray(); 
    }*/
    
}
