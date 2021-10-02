package com.vector.apibank.modulos.funcionario;

import java.util.*;

import com.vector.apibank.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
class ModelFuncionario extends Model{

    @Autowired
    JdbcTemplate jdbcTemplate;

    ModelFuncionario(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String,Object>> listarFuncionario(){

        String sql = "SELECT * FROM funcionario WHERE excluido IS NULL";
        
        return jdbcTemplate.queryForList(sql);
    }

    public int criarFuncionario( Funcionario objFuncionario)throws IllegalArgumentException, IllegalAccessException{

        String colunas_insercao  = this.ControiQueryeArrayListParaUpdate(objFuncionario);
        String sql = "INSERT INTO funcionario SET excluido = NULL " + colunas_insercao;

        return jdbcTemplate.update(sql,this.dados_insecao.toArray());
    }

    public int editarFuncionario( Funcionario objFuncionario)throws IllegalArgumentException, IllegalAccessException{

        String colunas_insercao  = this.ControiQueryeArrayListParaUpdate(objFuncionario);
        
        String sql = "UPDATE funcionario SET excluido = NULL " + colunas_insercao + "WHERE id = ?";

        this.dados_insecao.add(objFuncionario.id);

        return jdbcTemplate.update(sql, this.dados_insecao.toArray());

    }
    public int excluirFuncionario( Funcionario objFuncionario){

        String sql = "UPDATE Funcionario SET excluido = NOW() WHERE id = ?";

        return jdbcTemplate.update(sql, objFuncionario.id);

    }
}