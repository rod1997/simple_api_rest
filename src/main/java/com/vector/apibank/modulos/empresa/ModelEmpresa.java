package com.vector.apibank.modulos.empresa;

import java.util.*;

import com.vector.apibank.Model;

import java.lang.IllegalAccessException;
import java.lang.IllegalArgumentException;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ModelEmpresa extends Model{

    private JdbcTemplate jdbcTemplate;

    ModelEmpresa(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String,Object>> listarEmpresa(){

        String sql = "SELECT * FROM empresa WHERE excluido IS NULL;";

        return jdbcTemplate.queryForList(sql);
    }

    public int criarEmpresa( Empresa objEmpresa)throws IllegalArgumentException, IllegalAccessException{

        String colunas_insercao  = this.ControiQueryeArrayListParaUpdate(objEmpresa);
        String sql = "INSERT INTO empresa SET excluido = NULL " + colunas_insercao;

        return jdbcTemplate.update(sql,this.dados_insecao.toArray());
    }

    public int editarEmpresa( Empresa objEmpresa)throws IllegalArgumentException, IllegalAccessException{

        String colunas_insercao  = this.ControiQueryeArrayListParaUpdate(objEmpresa);
        
        String sql = "UPDATE empresa SET excluido = NULL " + colunas_insercao + "WHERE id = ?";

        this.dados_insecao.add(objEmpresa.id);

        return jdbcTemplate.update(sql, this.dados_insecao.toArray());

    }
    public int excluirEmpresa( Empresa objEmpresa){

        String sql = "UPDATE empresa SET excluido = NOW() WHERE id = ?";

        return jdbcTemplate.update(sql, objEmpresa.id);

    }
}
