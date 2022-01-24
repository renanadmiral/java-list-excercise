package com.listpractice;

public class ListaPessoas implements EstruturaDados{

    private Pessoa[] pessoas = new Pessoa[10];
    private int index = 0;

    @Override
    public void adicionar(Pessoa pessoa) {
        this.pessoas[index] = pessoa;
        this.index++;
    }

    @Override
    public Pessoa buscar(String nome) throws RuntimeException {
        for (int i = 0; i < this.index; i++) {
            if (this.pessoas[i].getNome().equals(nome)) {
                return pessoas[i];
            }
        }
        throw new RuntimeException(nome + " não encontrado");
    }

    @Override
    //cria um novo array, deleta um objeto e diminui o tamanho do array
    public void remover(Pessoa pessoa) {
        Pessoa[] smallerPessoas = new Pessoa[(this.index - 1)];
        boolean deleteHasBeenDone = false;

        for (int i = 0; i < this.index; i++) {
            if (!pessoas[i].equals(pessoa)) {
               if (deleteHasBeenDone) {
                   smallerPessoas[(i-1)] = this.pessoas[i];
               }  else {
                   smallerPessoas[i] = this.pessoas[i];
               }
            } else {
                deleteHasBeenDone = true;
            }
        }

        for (Pessoa p: smallerPessoas) {
            System.out.println(p.toString());
        }
    }

    @Override
    public void remover(int index) {
        Pessoa[] smallerPessoas = new Pessoa[(this.index - 1)];
        boolean deleteHasBeenDone = false;

        for (int i = 0; i < this.index; i++) {
            if (i != index) {
                if (deleteHasBeenDone) {
                    smallerPessoas[(i-1)] = this.pessoas[i];
                }  else {
                    smallerPessoas[i] = this.pessoas[i];
                }
            } else {
                deleteHasBeenDone = true;
            }
        }

        for (Pessoa p: smallerPessoas) {
            System.out.println(p.toString());
        }
    }

    @Override
    public void listarTodos() {
        for (int i = 0; i < this.index ; i++) {
            System.out.println(pessoas[i].getNome());
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
        for (int i = 0; i < this.index; i++) {
            if (i == index) {
                return this.pessoas[i];
            }
        }
        return null;
    }
}

