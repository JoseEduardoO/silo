package com.mycompany.projetosilo.util;

import com.mycompany.projetosilo.modelo.Usuario;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Arquivo {

    public static void inserir(Usuario usuario) {
        try {
            ArrayList<Usuario> atual = listar();
            atual.add(usuario);
            FileOutputStream fos = new FileOutputStream(info.ARQUIVO_USUARIO);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(atual);
            oos.close();
        } catch (IOException ex) {
            System.out.println("erro ao inserir ");
        }
    }
    
    public static ArrayList<Usuario> listar() {
        ArrayList<Usuario> lista = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(info.ARQUIVO_USUARIO);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ArrayList<Usuario>) ois.readObject();
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