package com.vector.apibank.modulos.horario_ponto;

import java.util.*;

import com.vector.apibank.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
class ModelHorarioPonto extends Model{

    @Autowired
    JdbcTemplate jdbcTemplate;

    ModelHorarioPonto(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String,Object>> listarHorarioPonto(){

        String sql = "SELECT * FROM horario_ponto;";
        
        return jdbcTemplate.queryForList(sql);
    }

    public int criarHorarioPonto( HorarioPonto objHorarioPonto)throws IllegalArgumentException, IllegalAccessException{

        String colunas_insercao  = this.ControiQueryeArrayListParaUpdate(objHorarioPonto);
        String sql = "INSERT INTO horarioPonto SET excluido = NULL " + colunas_insercao;

        return jdbcTemplate.update(sql,this.dados_insecao.toArray());
    }

    public int editarHorarioPonto( HorarioPonto objHorarioPonto)throws IllegalArgumentException, IllegalAccessException{

        String colunas_insercao  = this.ControiQueryeArrayListParaUpdate(objHorarioPonto);
        
        String sql = "UPDATE horarioPonto SET excluido = NULL " + colunas_insercao + "WHERE id = ?";

        this.dados_insecao.add(objHorarioPonto.id);

        return jdbcTemplate.update(sql, this.dados_insecao.toArray());

    }
    public int excluirHorarioPonto( HorarioPonto objHorarioPonto){

        String sql = "UPDATE horarioPonto SET excluido = NOW() WHERE id = ?";

        return jdbcTemplate.update(sql, objHorarioPonto.id);

    }
}