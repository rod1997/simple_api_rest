package com.vector.apibank.modulos.usuario;

import org.springframework.security.core.GrantedAuthority;

public class Perfil implements GrantedAuthority{
    private long id;
    private String nome;


    public String getAuthority(){
        return nome;
    }
}
