package com.vector.apibank.modulos.empresa;
import java.util.*;

import java.lang.IllegalAccessException;
import java.lang.IllegalArgumentException;

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
@RequestMapping("/empresa")

public class ControllerEmpresa {

    @Autowired
    ModelEmpresa objModalEmpresa;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Map<String,Object>>  listarEmpresa(){

        return objModalEmpresa.listarEmpresa();
    }

    @RequestMapping(value = "/criar", method = RequestMethod.POST)
    public ResponseEntity<String>  criarEmpresa(@RequestBody Empresa objEmpresa)throws IllegalArgumentException, IllegalAccessException{

        int last_id = objModalEmpresa.criarEmpresa(objEmpresa);

        return new ResponseEntity<>("id inserido: "+ Integer.toString(last_id), HttpStatus.OK);
    }

    @RequestMapping(value = "/editar", method = RequestMethod.POST)
    public ResponseEntity<String>  editarEmpresa(@RequestBody Empresa objEmpresa)throws IllegalArgumentException, IllegalAccessException{

        int last_id = objModalEmpresa.editarEmpresa(objEmpresa);

        return new ResponseEntity<>("id inserido: "+ Integer.toString(last_id), HttpStatus.OK);
    }

    @RequestMapping(value = "/excluir", method = RequestMethod.POST)
    public ResponseEntity<String>  excluirEmpresa(@RequestBody Empresa objEmpresa)throws IllegalArgumentException, IllegalAccessException{

        int last_id = objModalEmpresa.excluirEmpresa(objEmpresa);

        return new ResponseEntity<>("id inserido: "+ Integer.toString(last_id), HttpStatus.OK);
    }

}

    
