package com.vector.apibank;

import java.lang.reflect.Field;
import java.util.*;


import java.lang.IllegalAccessException;
import java.lang.IllegalArgumentException;


public abstract class Model {

  
    public ArrayList<Object> dados_insecao;

    final public String ControiQueryeArrayListParaUpdate(Object objetoGenerico)throws IllegalArgumentException, IllegalAccessException{

        String pedaco_sql = "";

        ArrayList<Object> dados_insercao = new ArrayList<>();

        Class<?> objeto_generico = objetoGenerico.getClass();

        for(Field atributo : objeto_generico.getDeclaredFields()) {

            atributo.setAccessible(true);

            if(atributo.get(objetoGenerico) != null && (!atributo.getName().equals("id"))){
                dados_insercao.add(atributo.get(objetoGenerico));
                pedaco_sql += " ," + atributo.getName() + " = ?";
            }    
        }
        this.dados_insecao = dados_insercao;
        return pedaco_sql;

    }
    
}
