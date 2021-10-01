package com.vector.apibank.modulos.funcionario;

import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//port org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")

public class ControllerFuncionario {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    ModelFuncionario objEmpresa;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Map<String,Object>>  listarEmpresa(){

        return objEmpresa.listarFuncionario();
    }

    @RequestMapping(value = "/criar", method = RequestMethod.POST)
    public ResponseEntity<String>  criarEmpresa(@RequestBody Funcionario novoFuncionario){
        
        int last_id = objEmpresa.criarFuncionario(novoFuncionario);

        return new ResponseEntity<>("id inserido: "+ Integer.toString(last_id), HttpStatus.OK);
    }
}
