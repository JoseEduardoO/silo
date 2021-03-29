package com.mycompany.projetosilo.modelo;

public class Silo {
    int armazenamento;

    public Silo() {
    }

    public Silo(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public int getCapacidade() {
        return armazenamento;
    }

    public void setCapacidade(int armazenamento) { 
        this.armazenamento = armazenamento;
        
    }    
}