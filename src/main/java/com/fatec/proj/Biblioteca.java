package com.fatec.proj;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<Livro>();

    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void save(Livro livro) {
    	if(livros.stream().noneMatch(li -> li.getIsbn().equals(livro.getIsbn()))
    		&& !livro.getIsbn().isEmpty()
    		&& !livro.getTitulo().isEmpty()
    	    && !livro.getAutor().isEmpty())
            livros.add(livro);
            
    }

    public int size() {
        return livros.size();
    }
}
