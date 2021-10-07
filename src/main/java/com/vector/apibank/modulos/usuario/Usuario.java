package com.vector.apibank.modulos.usuario;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.ArrayList;

import  java.util.Collection;

public class Usuario implements UserDetails{

    private List<Perfil> perfis = new ArrayList<>();

    private String username;
    private String password;

  public  Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities(){
      return this.perfis;
  }
  
  public java.lang.String getPassword(){
      return this.password;
  }
  
  public java.lang.String getUsername(){
      return this.username;
  }
  
  public boolean isAccountNonExpired(){
      return true;
  }
  
  public boolean isAccountNonLocked(){
      return true;
  }
  
  public boolean isCredentialsNonExpired(){
      return true;
  }
  
  public boolean isEnabled(){
      return true;
  }
    
}
