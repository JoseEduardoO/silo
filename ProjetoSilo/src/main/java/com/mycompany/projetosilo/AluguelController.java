package com.mycompany.projetosilo;

import com.mycompany.projetosilo.modelo.Aluguel;
import com.mycompany.projetosilo.modelo.Produtor;
import com.mycompany.projetosilo.util.ArquivoAluguel;
import com.mycompany.projetosilo.util.ArquivoProdutor;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AluguelController {
    @FXML
    private TextField campoNome;
    @FXML
    private TextField campoQuantidade;
    @FXML
    private DatePicker campoData;
    @FXML
    private TextField campoOrigem;
    @FXML
    private Label campoDeStatus;
    
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menu");
    }    
    
    @FXML
    private void limparCampos(){
        this.campoNome.setText("");
        this.campoQuantidade.setText("");
        this.campoOrigem.setText("");
        this.campoDeStatus.setText("");
        this.campoData.getEditor().clear();
    }
    
    @FXML
    private void cadastrarAluguel() throws IOException{
        ArrayList<Produtor> lista = ArquivoProdutor.listar();
        
        Aluguel a = new Aluguel();
        int conferirNome = -1;
        
        for(Produtor p : lista){
            if(p.getNome().equals(campoNome.getText())){
                conferirNome = lista.indexOf(p);
            }
            
        if(conferirNome != -1){
            a.setId(verificaID());
            a.setProdutor(lista.get(conferirNome));
            a.setDataInicial(campoData.getValue());
            a.setStatus("Pendência");
            int quantidade = Integer.parseInt(campoQuantidade.getText());
            a.setQuantidade(quantidade);
            ArquivoAluguel.inserir(a);
            campoDeStatus.setText("Salvo");
            limparCampos();
        }
        else{
            campoDeStatus.setText("Esse produtor não existe");
             }
        }
    } 
    private int verificaID(){
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        int id = 0;
        
        if(lista.isEmpty()){
            return 1;
        }else{
            for(Aluguel u : lista){
                id = u.getId();
            }
            
            return id+1;
        }
    } 
 
}