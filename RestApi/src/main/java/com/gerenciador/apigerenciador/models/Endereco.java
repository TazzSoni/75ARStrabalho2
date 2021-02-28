/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerenciador.apigerenciador.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Rodrigo
 */
@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
     private String rua = ""; 
    private String cep = ""; 
    private String cidade = ""; 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
 
    public String getRua() { 
        return rua; 
    } 
 
    public void setRua(String rua) { 
        this.rua = rua; 
    } 
 
    public String getCep() { 
        return cep; 
    } 
 
    public void setCep(String cep) { 
        this.cep = cep; 
    } 
 
    public String getCidade() { 
        return cidade; 
    } 
 
    public void setCidade(String cidade) { 
        this.cidade = cidade; 
    } 
}
