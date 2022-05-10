package com.mycompany.acessoddmaven.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tabelateste")

public class Analista implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_analsita")
    private int id;
    
    @Column(name="nome_analsita", length = 100)
    private String nome_analista;
 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    public String getNome_analista() {
        return nome_analista;
    }

    public void setNome_analista(String nome_analista) {
        this.nome_analista = nome_analista;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.nome_analista);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Analista other = (Analista) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.nome_analista, other.nome_analista);
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome_analista=" + nome_analista + '}';
    }    
    
}
