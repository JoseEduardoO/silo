package com.mycompany.projetosilo.util;

import com.mycompany.projetosilo.modelo.Aluguel;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArquivoAluguel {
    public static void inserir(Aluguel aluguel) {
        try {
            ArrayList<Aluguel> atual = listar();
            atual.add(aluguel);
            FileOutputStream fos = new FileOutputStream(info.ARQUIVO_ALUGUEL);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(atual);
            oos.close();
        } catch (IOException ex) {
            System.out.println("erro ao inserir ");
        }
    }
    
    public static ArrayList<Aluguel> listar() {
        ArrayList<Aluguel> lista = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(info.ARQUIVO_ALUGUEL);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ArrayList<Aluguel>) ois.readObject();
            ois.close();
            return lista;
        } catch (FileNotFoundException e) {
            System.out.println("não foi encontrado o arquivo");
        } catch (EOFException e) {  
            return lista;
        } catch (IOException | ClassNotFoundException e) {

        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("não está lendo o arquivo");
            }
        }
        return lista;
    }
}