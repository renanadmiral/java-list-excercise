package com.listpractice;

public interface EstruturaDados {
    void adicionar(Pessoa pessoa);
    Pessoa buscar (String nome) throws RuntimeException;
    void remover(Pessoa pessoa);
    void remover(int index);
    void listarTodos();
    Pessoa getPessoa(int index);
}
