package com.vector.apibank.modulos.horario_ponto;

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
@RequestMapping("/horario-ponto")

public class ControllerHorarioPonto {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    ModelHorarioPonto objEmpresa;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Map<String,Object>>  listarEmpresa(){

        return objEmpresa.listarHorarioPonto();
    }

    @RequestMapping(value = "/criar", method = RequestMethod.POST)
    public ResponseEntity<String>  criarEmpresa(@RequestBody HorarioPonto novaHorarioPonto){

    
        int last_id = objEmpresa.criarHorarioPonto(novaHorarioPonto);

        return new ResponseEntity<>("id inserido: "+ Integer.toString(last_id), HttpStatus.OK);
    }
}
