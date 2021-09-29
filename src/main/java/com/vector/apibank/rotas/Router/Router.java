package com.vector.apibank.rotas.Router;
import java.util.List;
import com.vector.apibank.tipos.Cliente;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//port org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Router {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/Router", method = RequestMethod.GET)
    public List<Cliente> listarClientes(){

        Controller obj_controller = new Controller();

        List<Cliente> lista_cliente = obj_controller.listarClientes();

        return lista_cliente;
    }

}
