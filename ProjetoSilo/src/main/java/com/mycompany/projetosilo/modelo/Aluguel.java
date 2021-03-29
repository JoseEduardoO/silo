package com.mycompany.projetosilo.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Aluguel implements Serializable{
    Produtor produtor;
    int id;
    int quantidade;
    String status;
    LocalDate dataInicial;

    
    public Aluguel() {
        
    }
    
    public Aluguel(Produtor produtor, int id, int quantidade, String status, LocalDate dataInicial) {
        this.produtor = produtor;
        this.id = id;
        this.quantidade = quantidade;
        this.status = status;
        this.dataInicial = dataInicial;
    }
    

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

 
       
}
