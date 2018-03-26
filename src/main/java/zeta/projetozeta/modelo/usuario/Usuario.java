/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.modelo.usuario;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import zeta.projetozeta.modelo.pesquisa.Pesquisa;

/**
 *
 * @author Jp
 */
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id 
    @GeneratedValue
    @Column(name = "id")
    private long id;
    private String nome;
    private String senha;
    private String email;
    
    @OneToMany
    @JoinTable(name = "usuario_pesquisa", 
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "Pesquisa_id"))
    private List<Pesquisa> pesquisa;

    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        pesquisa = new ArrayList<Pesquisa>();
    }

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario() {
    }
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Pesquisa> getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(List<Pesquisa> pesquisa) {
        this.pesquisa = pesquisa;
    }
}
