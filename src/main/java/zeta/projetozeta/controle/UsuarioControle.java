/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.controle;

import zeta.projetozeta.modelo.usuario.Usuario;
import zeta.projetozeta.modelo.usuario.UsuarioRN;

/**
 *
 * @author Jp
 */
public class UsuarioControle {
    UsuarioRN usuarioRN;

    public UsuarioControle() {
        usuarioRN = new UsuarioRN();
    }
    
    public boolean RealizarLogin(Usuario usuario){
        return usuarioRN.login(usuario);
    }
    
    public boolean cadastrarUsuario(Usuario usuario){
        usuarioRN.adicionarUsuario(usuario);
        return true;
    }
}
