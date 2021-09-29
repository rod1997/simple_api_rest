package com.vector.apibank.rotas;

import com.vector.apibank.tipos.Cliente;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Controller {

    private JdbcTemplate jdbcTemplate;

    public List<Cliente> modelo(){

        String sql = "SELECT * FROM clientes";

        List<Cliente> retorno_banco = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Cliente.class));

        return retorno_banco;


     }
}
