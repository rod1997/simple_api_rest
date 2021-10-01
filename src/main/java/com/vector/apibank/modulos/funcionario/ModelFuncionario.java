package com.vector.apibank.modulos.funcionario;

import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
class ModelFuncionario{

    private JdbcTemplate jdbcTemplate;

    ModelFuncionario(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String,Object>> listarFuncionario(){

        String sql = "SELECT * FROM funcionario;";
        
        return jdbcTemplate.queryForList(sql);
    }

    public int criarFuncionario( Funcionario novoFuncionario){

        String sql = "INSERT INTO funcionario(id_empresa,nome,cpf) values(\"" + novoFuncionario.nome + "\", \" " + novoFuncionario.nome + "\"," + "\"" +novoFuncionario.cpf + "\")";

        return jdbcTemplate.update(sql);

    }
}