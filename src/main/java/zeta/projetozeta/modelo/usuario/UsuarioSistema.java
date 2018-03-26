/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.usuario;

import zeta.projetozeta.modelo.pesquisa.Pesquisa;

/**
 *
 * @author Jp
 */
public class UsuarioSistema {
    private volatile static Usuario usuarioSistema;

    public UsuarioSistema() {}
    
    
    public static Usuario getInstance(){
        if(usuarioSistema ==  null){
            synchronized (UsuarioSistema.class){
                if(usuarioSistema == null){
                    return usuarioSistema = new Usuario();
                }
            }
        }
        return usuarioSistema;
    }
    
    public static void setInstance(Usuario usuario){
        if(usuarioSistema ==  null){
            synchronized (UsuarioSistema.class){
                if(usuarioSistema != null){
                    usuarioSistema = usuario;
                }
            }
        }
    }

    public static void setInstancePesquisa(Pesquisa pesquisa){
        if(usuarioSistema !=  null){
            synchronized (UsuarioSistema.class){
                if(usuarioSistema != null){
                    usuarioSistema.getPesquisa().add(pesquisa);
                }
            }
        }
    } 
}
