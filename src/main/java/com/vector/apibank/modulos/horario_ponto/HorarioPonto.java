package com.vector.apibank.modulos.horario_ponto;

public class HorarioPonto {
    public int id_funcionario;
    public String data_hora_batida;

    HorarioPonto(int id_funcionario, String data_hora_batida){
        this.id_funcionario = id_funcionario ;
        this.data_hora_batida = data_hora_batida ;
    }

}
