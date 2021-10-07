package com.vector.apibank.modulos.usuario;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm {
    public  String username;
    public String senha;

    LoginForm(String username,String senha){
        this.username = username;
        this.senha = senha;
    }

    public UsernamePasswordAuthenticationToken converter(){
        return new UsernamePasswordAuthenticationToken(this.username, this.senha);
    }

}
