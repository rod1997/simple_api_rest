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
    ModelHorarioPonto objModalHorarioPonto;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Map<String,Object>>  listarEmpresa(){

        return objModalHorarioPonto.listarHorarioPonto();
    }

    @RequestMapping(value = "/criar", method = RequestMethod.POST)
    public ResponseEntity<String>  criarHorarioPonto(@RequestBody HorarioPonto objHorarioPonto)throws IllegalArgumentException, IllegalAccessException{

        int last_id = objModalHorarioPonto.criarHorarioPonto(objHorarioPonto);

        return new ResponseEntity<>("id inserido: "+ Integer.toString(last_id), HttpStatus.OK);
    }

    @RequestMapping(value = "/editar", method = RequestMethod.POST)
    public ResponseEntity<String>  editarHorarioPonto(@RequestBody HorarioPonto objHorarioPonto)throws IllegalArgumentException, IllegalAccessException{

        int last_id = objModalHorarioPonto.editarHorarioPonto(objHorarioPonto);

        return new ResponseEntity<>("id inserido: "+ Integer.toString(last_id), HttpStatus.OK);
    }

    @RequestMapping(value = "/excluir", method = RequestMethod.POST)
    public ResponseEntity<String>  excluirHorarioPonto(@RequestBody HorarioPonto objHorarioPonto)throws IllegalArgumentException, IllegalAccessException{

        int last_id = objModalHorarioPonto.excluirHorarioPonto(objHorarioPonto);

        return new ResponseEntity<>("id inserido: "+ Integer.toString(last_id), HttpStatus.OK);
    }
}
