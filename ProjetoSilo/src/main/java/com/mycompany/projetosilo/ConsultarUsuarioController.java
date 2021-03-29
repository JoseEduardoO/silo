package com.mycompany.projetosilo;

import com.mycompany.projetosilo.modelo.Usuario;
import com.mycompany.projetosilo.util.Arquivo;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import com.mycompany.projetosilo.App;

public class ConsultarUsuarioController {
    
    @FXML
    private TextArea campoListaUsuario;
    
    @FXML
    private void consultarUsuario(){
        ArrayList<Usuario> lista = Arquivo.listar();
    
        for(Usuario i : lista){
            campoListaUsuario.appendText("Login: " + i.getLogin() + "    ");
            campoListaUsuario.appendText("Nome: " + i.getNome() + "\n");
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
             campoListaUsuario.setText("");
    }
}
