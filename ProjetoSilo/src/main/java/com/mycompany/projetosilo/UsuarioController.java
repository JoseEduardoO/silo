package com.mycompany.projetosilo;

import javafx.fxml.FXML;
import com.mycompany.projetosilo.modelo.Usuario;
import com.mycompany.projetosilo.util.Arquivo;
import java.io.IOException;
import javafx.scene.control.TextField;
import com.mycompany.projetosilo.App;

public class UsuarioController {
    
    @FXML
    private TextField campoLogin;

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoSenha;
    
    @FXML
    private void cadastrarUsuario() throws IOException{
        Usuario usuario = new Usuario();
        usuario.setLogin(campoLogin.getText());
        usuario.setNome(campoNome.getText());
        usuario.setSenha(campoSenha.getText());
        Arquivo.inserir(usuario);
        limparCampos();
    }
    
    @FXML
    private void limparCampos(){
        this.campoLogin.setText("");
        this.campoNome.setText("");
        this.campoSenha.setText("");
    }
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menu");
    }
     
}
