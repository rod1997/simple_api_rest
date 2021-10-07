package com.vector.apibank.modulos.usuario;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AutentificacaoController {
    
    @Autowired
    private AuthenticationManager authManager;

    @PostMapping
    public ResponseEntity<?> autentificar(@RequestBody LoginForm dados_login){

        UsernamePasswordAuthenticationToken dadosLogin = dados_login.converter();
        Authentication authentication =  authManager.authenticate(dadosLogin);

        System.out.println(dados_login.username);
        System.out.println(dados_login.senha);

        return ResponseEntity.ok().build();


    }
}
