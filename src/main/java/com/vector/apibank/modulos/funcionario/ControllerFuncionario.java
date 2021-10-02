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
    ModelFuncionario objModalFuncionario;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Map<String,Object>>  listarEmpresa(){

        return objModalFuncionario.listarFuncionario();
    }

    @RequestMapping(value = "/criar", method = RequestMethod.POST)
    public ResponseEntity<String>  criarFuncionario(@RequestBody Funcionario objFuncionario)throws IllegalArgumentException, IllegalAccessException{

        int last_id = objModalFuncionario.criarFuncionario(objFuncionario);

        return new ResponseEntity<>("id inserido: "+ Integer.toString(last_id), HttpStatus.OK);
    }

    @RequestMapping(value = "/editar", method = RequestMethod.POST)
    public ResponseEntity<String>  editarFuncionario(@RequestBody Funcionario objFuncionario)throws IllegalArgumentException, IllegalAccessException{

        int last_id = objModalFuncionario.editarFuncionario(objFuncionario);

        return new ResponseEntity<>("id inserido: "+ Integer.toString(last_id), HttpStatus.OK);
    }

    @RequestMapping(value = "/excluir", method = RequestMethod.POST)
    public ResponseEntity<String>  excluirFuncionario(@RequestBody Funcionario objFuncionario)throws IllegalArgumentException, IllegalAccessException{

        int last_id = objModalFuncionario.excluirFuncionario(objFuncionario);

        return new ResponseEntity<>("id inserido: "+ Integer.toString(last_id), HttpStatus.OK);
    }
}
