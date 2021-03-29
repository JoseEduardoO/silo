package com.mycompany.projetosilo;

import com.mycompany.projetosilo.modelo.Aluguel;
import com.mycompany.projetosilo.util.ArquivoAluguel;
import java.io.IOException;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import com.mycompany.projetosilo.App;


public class PagamentoController {

    @FXML
    private TextField campoNumero01;
    @FXML
    private TextField campoNumero02;
    @FXML
    private TextField campoResultado;
  
    
    @FXML
    private void calcular(){
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        
    int num1 = Integer.parseInt(campoNumero01.getText());
    int num2 = Integer.parseInt(campoNumero02.getText());
    
    int resultado = num1 + num2*10;

    campoResultado.setText("" + resultado);
    }
   
    @FXML
    private void pagamento(){
     
    }
    
    
    
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menuPrincipal");
    }
}