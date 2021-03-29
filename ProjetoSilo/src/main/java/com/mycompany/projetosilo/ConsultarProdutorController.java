package com.mycompany.projetosilo;

import com.mycompany.projetosilo.modelo.Usuario;
import com.mycompany.projetosilo.util.Arquivo;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import com.mycompany.projetosilo.App;
import com.mycompany.projetosilo.modelo.Produtor;
import com.mycompany.projetosilo.util.ArquivoProdutor;

public class ConsultarProdutorController {
    
    @FXML
    private TextArea campoListaProdutor;
    
    @FXML
    private void consultarProdutor(){
        ArrayList<Produtor> lista = ArquivoProdutor.listar();
    
        for(Produtor i : lista){
            campoListaProdutor.appendText("Nome: " + i.getNome() + "    ");
            campoListaProdutor.appendText("Cpf: " + i.getCpf() + "  ");
            campoListaProdutor.appendText("Cidade: " + i.getCidade() + "\n");
        }
    }
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menu");
    }
    
    @FXML
    private void limparCampos(){
             campoListaProdutor.setText("");
    }
}
