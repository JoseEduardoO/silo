package com.mycompany.projetosilo.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Produtor implements Serializable{
    String nome;
    String cpf; 
    String rua;
    String cidade;
    String estado;
    LocalDate dataNascimento;  
    
    
    public Produtor() {
       this.nome = "";
       this.cpf = "";
       this.rua = "";
       this.cidade = "";
       this.estado = "";
    }
     
    public Produtor(String nome, String cpf, String rua, String cidade, String estado, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
       
}
