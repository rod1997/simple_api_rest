package com.vector.apibank.modulos.empresa;
import java.util.*;

//import org.springframework.beans.factory.annotation.Autowired;
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
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Map<String,Object>>  listarEmpresa(){

        ModelEmpresa objEmpresa = new ModelEmpresa(this.jdbcTemplate);
        
        return objEmpresa.listarEmpresa();
    }

    @RequestMapping(value = "/criar", method = RequestMethod.POST)
    public ResponseEntity<String>  criarEmpresa(@RequestBody Empresa novaEmpresa){

        System.out.print(novaEmpresa);

        ModelEmpresa objEmpresa = new ModelEmpresa(this.jdbcTemplate);
        
        int last_id = objEmpresa.criarEmpresa(novaEmpresa);

        return new ResponseEntity<>("id inserido: "+Integer.toString(last_id), HttpStatus.OK);
    }

}

    
