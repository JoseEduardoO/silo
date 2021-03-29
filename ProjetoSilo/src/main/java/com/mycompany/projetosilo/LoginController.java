package com.mycompany.projetosilo;

import com.mycompany.projetosilo.modelo.Usuario;
import com.mycompany.projetosilo.util.Arquivo;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import com.mycompany.projetosilo.App;
import javafx.event.ActionEvent;

public class LoginController {
    
    @FXML
    private TextField campoLogin;

    @FXML
    private TextField campoSenha;
    
    @FXML
    private Text labelErro;

    @FXML
    private void sair(){
        System.exit(0);
    }  
    
    @FXML
    private void logar() throws IOException{   
       ArrayList<Usuario> lista = Arquivo.listar();
        for(Usuario u : lista){
            if(u.getLogin().equals(campoLogin.getText())){
                if(u.getSenha().equals(campoSenha.getText())){
                    App.setRoot("menu");
                }
            }else{
                labelErro.setText("Login ou/e Senha está errado ");
            }
        }
    }
    
    @FXML
    private void limparCampos(){
        campoLogin.setText("");
        campoSenha.setText("");
        labelErro.setText("");
    }
}
