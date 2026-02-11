package com.example;

import java.util.ArrayList;

public class Biblioteca {
    private static final int MAX_LIVROS = 100; // Variável de classe
    private ArrayList<Livro> livros; // Variável de instância

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) {
        
       boolean aTitulo = true;
    
       for(Livro livro2 : livros)
       {
            if(livro2.getTitulo() == livro.getTitulo())
            {
                
                aTitulo = false;
                
                break;
            }
       }
       
       if(aTitulo)
       {
           livros.add(livro);
       }
       
       return aTitulo;
    }

    public boolean removerLivro(String titulo) {
        
        for(Livro livro:livros)
        {
            if(livro.getTitulo() == titulo)
            {
                livros.remove(livro);
                
                return true;
            }
        }
        
        return false;
    }

    public void listarLivros() {
        
        for(Livro livro:livros)
        {
             
            System.out.println("titulo: " + livro.getTitulo() + "\n" + "Autor: " + livro.getAutor() + "\n"
            + "Ano: " + livro.getAno() + "\n");
            
        }
        
    }
}
