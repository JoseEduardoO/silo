package com.mycompany.projetosilo;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import com.mycompany.projetosilo.App;
import com.mycompany.projetosilo.modelo.Aluguel;
import com.mycompany.projetosilo.modelo.Produtor;
import com.mycompany.projetosilo.util.ArquivoAluguel;
import com.mycompany.projetosilo.util.ArquivoProdutor;

public class ConsultarAluguelController {
    
    @FXML
    private TextArea campoListaAluguel;
    
    @FXML
    private void listarAluguel(){
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        
            for(Aluguel i : lista){
            campoListaAluguel.appendText("Data inicial: " +i .getDataInicial() + "   ");
            campoListaAluguel.appendText("Quantidade: " + i.getQuantidade()+ "\n ");
            }
    }
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void limparCampos(){
             campoListaAluguel.setText("");
    }
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menu");
    }
 
}
