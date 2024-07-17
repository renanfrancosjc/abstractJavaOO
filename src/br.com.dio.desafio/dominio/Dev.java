package br.com.dio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev{
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void inscreverBootCamp(BootCamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    }

    public void progredirBootCamp(){
      Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
      if(conteudo.isPresent()){
        this.conteudoConcluidos.add(conteudo.get());
        this.conteudosInscritos.remove(conteudo.get());
      } else{
        System.err.println("Não esta matriculado em nenhum curso");
      }
    }

    public double calcularXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = new nome;
    }

    public Set<Conteudo> getConteudoInscritos(){
        return conteudosInscritos;
    }

    public Set<Conteudo> setConteudoConcluidos(Set<Conteudo> conteudoConcluidos){
        this.conteudosInscritos = new conteudosInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos(){
        return conteudoConcluidos;
    }

    public Set<Conteudo> setConteudoConcluidos(Set<Conteudo> conteudoConcluidos){
        this.conteudoConcluidos = new conteudoConcluidos;
    }



}