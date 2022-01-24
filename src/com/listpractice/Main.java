package com.listpractice;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("joao");
        pessoa1.setIdade(22);;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("maria");
        pessoa2.setIdade(11);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("jorge");
        pessoa3.setIdade(33);

        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("jessica");
        pessoa4.setIdade(44);

        ListaPessoas listaPessoas = new ListaPessoas();
        listaPessoas.adicionar(pessoa1);
        listaPessoas.adicionar(pessoa2);
        listaPessoas.adicionar(pessoa3);
        listaPessoas.adicionar(pessoa4);

        listaPessoas.listarTodos();
        System.out.println("---------------");

        System.out.println(listaPessoas.buscar("joao").toString());
        System.out.println("---------------");

        listaPessoas.remover(pessoa4);
        System.out.println("---------------");

        listaPessoas.remover(1);
        System.out.println("----------------");

        System.out.println(listaPessoas.getPessoa(2).toString());
    }
}
