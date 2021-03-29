package com.mycompany.projetosilo;

import com.mycompany.projetosilo.modelo.Produtor;
import com.mycompany.projetosilo.util.ArquivoProdutor;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import com.mycompany.projetosilo.App;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class ProdutorController {
    @FXML
    private TextField campoNome;
    @FXML
    private TextField campoCPF;
    @FXML
    private TextField campoRua;
    @FXML
    private TextField campoCidade;
    @FXML
    private TextField campoEstado;
    @FXML
    private DatePicker campoData;
    @FXML
    private Button botaoSalvar;
    
    @FXML
    private void cadastrar() throws IOException{
        Produtor p = new Produtor();
        p.setNome(campoNome.getText());
        p.setCpf(campoCPF.getText());
        p.setRua(campoRua.getText());
        p.setCidade(campoCidade.getText());
        p.setEstado(campoEstado.getText());
        p.setDataNascimento(campoData.getValue());
        ArquivoProdutor.inserir(p);
        limpar();
    }
    
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menu");
    }
    
    @FXML
    private void limpar(){
        this.campoNome.setText("");
        this.campoCPF.setText("");
        this.campoRua.setText("");
        this.campoCidade.setText("");
        this.campoEstado.setText("");
        this.campoData.getEditor().clear();
    }
}
