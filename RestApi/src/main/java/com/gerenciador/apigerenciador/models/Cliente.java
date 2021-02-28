package com.gerenciador.apigerenciador.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome; 
    private String email; 
    private String cpf; 
    private double salario; 
    
 
    public Cliente(String nome, String email, String cpf, double salario) { 
        this.nome = nome; 
        this.email = email; 
        this.cpf = cpf; 
        this.salario = salario; 
    } 
 
    public String getNome() { 
        return nome; 
    } 
 
    public void setNome(String nome) { 
        this.nome = nome; 
    } 
 
    public String getEmail() { 
        return email; 
    } 
 
    public void setEmail(String email) { 
        this.email = email; 
    } 
 
    public String getCpf() { 
        return cpf; 
    } 
 
    public void setCpf(String cpf) { 
        this.cpf = cpf; 
    } 
 
    public double getSalario() { 
        return salario; 
    } 
 
    public void setSalario(double salario) { 
        this.salario = salario; 
    } 
 
 
}
