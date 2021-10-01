package com.vector.apibank.modulos.horario_ponto;

import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
class ModelHorarioPonto{

    private JdbcTemplate jdbcTemplate;

    ModelHorarioPonto(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String,Object>> listarHorarioPonto(){

        String sql = "SELECT * FROM horario_ponto;";
        
        return jdbcTemplate.queryForList(sql);
    }

    public int criarHorarioPonto( HorarioPonto novoHorarioPonto){

        String sql = "INSERT INTO horario_ponto(id_funcionario,data_hora_batida) values(\"" + novoHorarioPonto.id_funcionario+ "\"," + "\"" +novoHorarioPonto.data_hora_batida + "\")";

        return jdbcTemplate.update(sql);

    }
}