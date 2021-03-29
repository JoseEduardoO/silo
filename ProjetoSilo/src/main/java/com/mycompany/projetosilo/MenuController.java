package com.mycompany.projetosilo;

import java.io.IOException;
import javafx.fxml.FXML;
import com.mycompany.projetosilo.App;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

// Video aula de imagem https://www.youtube.com/watch?v=_SlsIxWV41c

public class MenuController {
    
    @FXML
    private ImageView imageview;
    
    @FXML
    private Button apertar;
    
    @FXML
    private void handleButtonAction(ActionEvent event){
	Image image = new Image("/icones/silos.jpg");
        
        imageview.setImage(image);
}

   @FXML
    private void login() throws IOException{
        App.setRoot("login");
    } 
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void cadastrarUsuario() throws IOException{
        App.setRoot("usuario");
    }
    
   @FXML
    private void consultarUsuario() throws IOException{
        App.setRoot("consultarUsuario");
    }
    
    @FXML
    private void cadastrarProdutor() throws IOException{
        App.setRoot("produtor");
    }
    
    @FXML
    private void consultarProdutor() throws IOException{
        App.setRoot("consultarProdutor");
    }
    
    @FXML
    private void cadastrarAluguel() throws IOException{
        App.setRoot("aluguel");
    }

    @FXML
    private void consultarAluguel() throws IOException{
        App.setRoot("consultarAluguel");
    }
    
    @FXML
    private void pagamento() throws IOException{
        App.setRoot("pagamento");
    }
    
}
