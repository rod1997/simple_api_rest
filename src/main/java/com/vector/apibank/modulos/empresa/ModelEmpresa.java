package com.vector.apibank.modulos.empresa;

import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ModelEmpresa {

    private JdbcTemplate jdbcTemplate;

    ModelEmpresa(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String,Object>> listarEmpresa(){

        String sql = "SELECT * FROM empresa;";
        
        return jdbcTemplate.queryForList(sql);
    }

    public int criarEmpresa( Empresa novaEmpresa){

        String sql = "INSERT INTO empresa(nome,cnpj) values(\"" + novaEmpresa.nome + "\"," + "\"" +novaEmpresa.cnpj + "\")";

        return jdbcTemplate.update(sql);

    }
}
