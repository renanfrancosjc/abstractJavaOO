package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXp(){
        return Xp_padrao * cargaHoraria;
    }

    public Curso(){}

    public String getCargaHoraria(){
        this.new cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria){
        return cargaHoraria;
    }

}