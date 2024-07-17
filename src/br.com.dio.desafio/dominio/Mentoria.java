package br.com.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    private LocalDate data;

    public Mentoria(){}

    @Override
    public double calcularXp(){
        return Xp_padrao + 20d;
    }

    public String getCargaHoraria(){
        this.new cargaHoraria;
    }

    public void setData(LocalDate data){
        return data;
    }

}