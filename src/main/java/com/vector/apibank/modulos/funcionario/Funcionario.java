package com.vector.apibank.modulos.funcionario;

public class Funcionario {
    
    public int id;
    public int id_empresa;
    public String nome;
    public String cpf;

    Funcionario(int id, int id_empresa, String nome, String cpf){
        this.id =id;
        this.id_empresa =id_empresa;
        this.nome =nome;
        this.cpf =cpf;
    }
}    
